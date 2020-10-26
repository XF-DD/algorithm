package Meituan;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: XF-DD
 * @Date: 20/09/20 23:55
 */
public class Test07 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition conditionA = lock.newCondition();
        Condition conditionB = lock.newCondition();
        Condition conditionC = lock.newCondition();

        new Thread(() -> {
            try{
                lock.lock();
                while (true){
                    conditionB.signal();
                    conditionA.await();
                    System.out.println("A");
                    conditionB.signal();
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            try{
                lock.lock();
                while (true){
                    conditionC.signal();
                    conditionB.await();
                    System.out.println("B");
                    conditionC.signal();
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            try{
                lock.lock();
                while (true){
                    conditionA.signal();
                    conditionC.await();
                    System.out.println("C");
                    conditionA.signal();
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }).start();
    }
}

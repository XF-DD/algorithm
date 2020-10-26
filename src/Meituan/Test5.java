package Meituan;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: XF-DD
 * @Date: 20/08/26 18:57
 */
public class Test5 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition conditionA = lock.newCondition();
        Condition conditionB = lock.newCondition();

        new Thread(() -> {
            try{
                while (true){
                    lock.lock();
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
                while (true){
                    lock.lock();
                    conditionA.signal();
                    conditionB.await();
                    System.out.println("b");
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

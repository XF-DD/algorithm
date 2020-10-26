package Meituan;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: XF-DD
 * @Date: 20/09/20 23:51
 */
public class Test06 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition conditionA = lock.newCondition();

        new Thread(() -> {
            try {
                lock.lock();
                for (int i = 0; i < 7; i++) {
                    conditionA.signal();
                    condition1.await();
                    System.out.println(i);
                    conditionA.signal();
                }
            }catch (Exception ignore){
            }finally {
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            try {
                lock.lock();
                for (int i = 'A'; i < 'H'; i++) {
                    condition1.signal();
                    conditionA.await();
                    System.out.println((char) i);
                    condition1.signal();
                }
            }catch (Exception ignore){
            }finally {
                lock.unlock();
            }
        }).start();
    }
}

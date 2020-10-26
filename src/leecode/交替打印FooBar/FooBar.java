package leecode.交替打印FooBar;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//https://leetcode-cn.com/problems/print-foobar-alternately/
public class FooBar {
    private int n;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean flag = false;

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        lock.lock();
        for (int i = 0; i < n; i++) {
            while (flag)
                condition.await();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            flag = true;
            condition.signal();
        }
        lock.unlock();
    }

    public void bar(Runnable printBar) throws InterruptedException {

        lock.lock();
        for (int i = 0; i < n; i++) {

            while (!flag)
                condition.await();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            flag = false;
            condition.signal();
        }
        lock.unlock();
    }
}

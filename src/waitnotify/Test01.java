package waitnotify;

/**
 * @Author: XF-DD
 * @Date: 20/09/21 0:08
 */
public class Test01 {
    private static boolean flag = false;
    public static void main(String[] args) {
        Object o = new Object();

        new Thread(() -> {
            synchronized (o){
                while (true){
                    while (flag){
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("A");
                    flag = true;
                    o.notify();
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (o){
               while (true){
                   while (!flag){
                       try {
                           o.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                   System.out.println("B");
                   flag = false;
                   o.notify();
               }
            }
        }).start();
    }
}

package juc;

/**
 * @Description 测试volatile
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-10 19:14:27
 */
public class VolatileHolder {
    int a = 0;
    boolean flag = false;

    public void write(){
        a = 1;
        flag = true;
    }

    public void read(){
        if(flag){
            if(a == 0){
                System.out.println("sure!!");
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            VolatileHolder volatileHolder = new VolatileHolder();

            new Thread(() -> {
                volatileHolder.write();;
            }).start();

            new Thread(() -> {
                volatileHolder.read();;
            }).start();
        }
    }
}

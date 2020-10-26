package Meituan;

import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/22 16:32
 */
public class Test {
    void t1(){
        Scanner in = new Scanner((System.in));
        int s = in.nextInt();
        int s2 = in.nextInt();
        in.nextLine();
        int s3 = in.nextInt();
        int s4 = in.nextInt();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.t1();

        String s = "abc".substring(0,1);

        new Thread(() -> {

        }).start();
    }
}

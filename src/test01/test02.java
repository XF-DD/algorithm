package test01;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: XF-DD
 * @Date: 20/06/18 9:55
 */
public class test02 {
    public static void main(String[] args) {
/*        int m = 500;
        Integer obj = m; // 自动装箱
        int n = obj; // 自动拆箱
        System.out.println("n = " + n);
        Integer obj1 = 500;
        System.out.println("obj 等价于 obj1？" + obj.equals(obj1));*/
        Integer i1=20;  //200 : == false; equals true
        Integer i2=20;
        System.out.println(i1== i2);
    }
}

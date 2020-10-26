package basic;

/**
 * @Author: XF-DD
 * @Date: 20/09/04 10:45
 */
public class TestInteger {
    public static void main(String[] args) {
        Integer integer = new Integer(1);
        TestInteger.test01(integer);
        System.out.println(integer);
    }

    public static void test01 (Integer integer){
        integer++;
    }
}

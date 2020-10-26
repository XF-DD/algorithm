package JD;

import java.util.Arrays;

/**
 * @Author: XF-DD
 * @Date: 20/08/27 19:38
 */
public class Test {
    public static void main(String[] args) {
        String s = "  AA BB  ";
        s= s.trim();
        String[] s2 = s.split(" ");
        System.out.println(s2.length);
        System.out.println(Arrays.toString(s2));
    }
}

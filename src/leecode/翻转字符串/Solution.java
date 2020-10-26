package leecode.翻转字符串;

import java.net.Socket;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 21:59
 */
public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        while (s.contains("  ")){
           s = s.replaceAll(" {2}"," ");
        }
        String[] s1 = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = s1.length-1; i >=0 ; i--) {
            builder.append(s1[i]).append(" ");
        }
        return   builder.deleteCharAt(builder.length()-1).toString();
    }

    public static void main(String[] args) {
        String abc = new String("111");
        String a = "111";
        String b = "1"+"11";
        System.out.println(a == b);
        System.out.println(a == abc);
        Solution solution = new Solution();
        solution.reverseWords("s");
    }
}

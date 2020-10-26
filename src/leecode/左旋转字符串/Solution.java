package leecode.左旋转字符串;

//https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
public class Solution {
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        if(n>len || n<1 || len>10000) return null;
        StringBuilder builder = new StringBuilder();
        for (int i = n ; i < len; i++) {
            builder.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

    public String reverseLeftWords2(String s, int n) {
        int len = s.length();
        if(n>len || n<1 || len>10000) return null;
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        String s = "0123456";
        String s1 = new Solution().reverseLeftWords2(s, 2);
        System.out.println(s1);
    }
}

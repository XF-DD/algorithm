package Offer.左旋转字符串;

/**
 * @Author: XF-DD
 * @Date: 20/08/26 20:38
 */
public class Solution {
    public String getString(String s , int i){
        s = reverse(s, 0, i-1);
        s = reverse(s,i,s.length()-1);
        s = reverse(s,0,s.length()-1);
        return s;
    }

    public String reverse(String s,int left,int right){
        while (right>left){
            char c = s.charAt(left);
            s = s.replace(s.charAt(left),s.charAt(right));
            s = s.replace(s.charAt(right),c);
            left++;
            right--;
        }
        return s;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getString("abcdefg", 3));
    }
}

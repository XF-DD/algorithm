package Offer.回文数;

/**
 * @Author: XF-DD
 * @Date: 20/06/10 10:22
 */
public class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length()-1;
        while (left<=right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

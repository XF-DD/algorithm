package Offer.回文数;

/**
 * @Author: XF-DD
 * @Date: 20/06/10 10:27
 */
public class Solution2 {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10 == 0 && x!=0)){
            return false;
        }

        int res = 0;
        while (res<x){
            res = res*10 + x%10;
            x /= 10;
        }

        return res == x || res/10 == x;
    }
}

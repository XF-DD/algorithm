package Offer.青蛙跳台阶;

/**
 * @Author: XF-DD
 * @Date: 20/06/01 11:43
 */
public class Solution {
    public int numWays(int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        int a = 1;
        int b = 2;
        int sum;
        for (int i = 3; i <= n; i++) {
            sum = (a+b)%1000000007;
            a = b;
            b = sum;
        }
        return b;
    }
}

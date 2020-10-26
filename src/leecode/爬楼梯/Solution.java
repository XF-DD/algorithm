package leecode.爬楼梯;

/**
 * @Author: XF-DD
 * @Date: 20/06/13 11:45
 */
public class Solution {
    public int climbStairs(int n) {
        int[] record = new int[n+1];
        record[0] = 1;
        record[1] = 1;
        for (int i = 2; i < n+1; i++) {
            record[i] = record[i-1]+record[i-2];
        }
        return record[n];
    }

    public int climbStairs2(int n) {
        double sqrt_5 = Math.sqrt(5);
        double fib_n = Math.pow((1+sqrt_5)/2,n+1)-Math.pow((1-sqrt_5)/2,n+1);
        return (int)(fib_n/sqrt_5);
    }
}

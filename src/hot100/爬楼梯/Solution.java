package hot100.爬楼梯;

/**
 * @Author: XF-DD
 * @Date: 20/09/06 10:38
 */
public class Solution {
    public int climbStairs(int n) {
        if(n <= 1){
            return n;
        }
        int[] record = new int[n + 1];
        record[0] = 1;
        record[1] = 1;
        for (int i = 2; i <= n; i++) {
            record[i] = record[i-1]+record[i-2];
        }
        return record[n];
    }
}

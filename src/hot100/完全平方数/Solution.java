package hot100.完全平方数;

/**
 * @Author: XF-DD
 * @Date: 20/08/16 11:41
 */
public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            // 和为i，最差每次+1，j*j小于i时，可能是dp[i] = dp[i - j*j](i - j*j) + 1(j*j)
            for (int j = 1; i - j*j >=0;j++){
                dp[i] = Math.min(dp[i],dp[i - j*j]+1);
            }
        }
        return dp[n];
    }
}

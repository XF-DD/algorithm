package hot100.买卖股票的最佳时机II;

/**
 * @Description https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-16 13:50:11
 */
public class Solution2 {

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            res += Math.max(0,prices[i+1]-prices[i]);
        }
        return res;
    }

}

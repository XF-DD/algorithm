package hot100.买卖股票的最佳时机II;

/**
 * @Description https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-16 13:43:32
 */
public class Solution {

    public int maxProfit(int[] prices) {
        int has0 = 0;
        int has1 = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            has0 = Math.max(has1+prices[i],has0);
            has1 = Math.max(has1,has0-prices[i]);
        }
        return has0;
    }

}

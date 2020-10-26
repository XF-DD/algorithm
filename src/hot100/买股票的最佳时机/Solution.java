package hot100.买股票的最佳时机;

/**
 * @Author: XF-DD
 * @Date: 20/09/06 10:33
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<1){
            return 0;
        }
        int max = 0;
        int pre = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(pre >= prices[i]){
                pre = prices[i];
            }else{
                int now = prices[i] - pre;
                if(now>max){
                    max = now;
                }
            }
        }
        return max;
    }
}

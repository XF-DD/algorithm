package leecode.股票的最大利润;

/**
 * @Author: XF-DD
 * @Date: 20/06/02 15:21
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for (int i :prices) {
            if(i - min >max){
                max = i-min;
            }else if(i<min){
                min = i;
            }
        }
        return max;
    }
}

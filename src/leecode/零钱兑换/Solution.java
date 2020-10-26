package leecode.零钱兑换;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode-cn.com/problems/coin-change-2/
public class Solution {
    public int change(int amount, int[] coins) {
        int len = coins.length;
        //判断条件可以忽略
        if(amount<1&&len<1)
            return 1;
        if(len<1)
            return 0;

        int[] record = new int[amount+1];
        record[0] = 1;
        for (int coin :coins) {
            if(coin>5000)
                return 0;
            for (int i = coin; i < amount+1; i++) {
                record[i] += record[i-coin];
            }
        }
        return record[amount];
    }
}

package leecode.硬币;

//https://leetcode-cn.com/problems/coin-lcci/
public class Solution {
    public int waysToChange(int n) {
        if (n <1)
            return 0;

        int[] coin = new int[]{1,5,10,25};
        int[] record = new int[n+1];
        record[0] = 1;

        for (int c = 0; c < coin.length; c++) {
            for (int i = 1 ; i < n+1 ; i++) {
                if(i>=coin[c]) {
                    record[i] += record[i-coin[c]];
                }
                if(record[i]>1000000007)
                    record[i]%=1000000007;
            }
        }
        return record[n];
    }
}

package Offer.青蛙跳台阶;

/**
 * @Author: XF-DD
 * @Date: 21/03/01 16:17
 */
public class Solution2 {

    public int numWays(int n) {
        if(n <2){
            return 1;
        }
        int[] record = new int[n+1];
        record[0] = 1;
        record[1] = 1;

        for (int i = 2; i <=n; i++) {
            record[i] = record[i-1] + record[i-2];
        }
        return record[n];
    }

}

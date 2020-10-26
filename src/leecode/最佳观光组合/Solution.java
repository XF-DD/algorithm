package leecode.最佳观光组合;

/**
 * @Author: XF-DD
 * @Date: 20/06/17 10:29
 */
public class Solution {
    public int maxScoreSightseeingPair(int[] A) {
        int res = 0;
        int max = A[0];

        for (int i = 1; i < A.length; i++) {
            res = Math.max(A[i] - i + max,res);
            max = Math.max(A[i]+i,max);
        }
        return res;
    }
}

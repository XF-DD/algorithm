package leecode.四数相加ll;

import java.util.HashMap;

/**
 * @Author: XF-DD
 * @Date: 20/06/11 11:08
 */
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                if (map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
        }

        int res = 0;

        for (int c : C) {
            for (int d : D){
                int sum =  - c - d;
                if(map.containsKey(sum)){
                    res += map.get(sum);
                }
            }
        }
        return res;
    }
}

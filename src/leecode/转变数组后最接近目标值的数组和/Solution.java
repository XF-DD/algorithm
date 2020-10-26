package leecode.转变数组后最接近目标值的数组和;

import java.util.Arrays;
//https://leetcode-cn.com/problems/sum-of-mutated-array-closest-to-target/
public class Solution {
    private int[] global_arr;
    private int len, sum1, sum2;
    public int findBestValue(int[] arr, int target) {
        global_arr = arr;
        Arrays.sort(arr);
        len = arr.length;
        int avg = target / len;
        int idx = findValue(0, avg);
        int diff = Math.abs(sum2 - target);
        while (true) {
            idx = findValue(idx, ++avg);
            if (Math.abs(sum2 - target) >= diff) {
                return avg - 1;
            } else {
                diff = Math.abs(sum2 - target);
            }
        }

    }

    private int findValue(int idx, int avg) {
        for (; idx < len; ++idx) {
            if (global_arr[idx] < avg) {
                sum1 += global_arr[idx];
            } else {
                sum2 = sum1;
                sum2 += avg * (len - idx);
                return idx;
            }
        }
        return idx;
    }

}

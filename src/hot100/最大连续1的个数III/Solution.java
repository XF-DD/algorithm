package hot100.最大连续1的个数III;

import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/max-consecutive-ones-iii/
 * 理解错题意：写成每次可改变连续的K个数
 * @Author: XF-DD
 * @Date: 21/02/19 14:24
 */
public class Solution {
    public int longestOnes(int[] A, int K) {
        int res = 0;
        int max = 0;
        int record = 0;



        for (int item : A) {
            System.out.println(res);
            if (item == 1) {
                record = 0;
                max++;
                continue;
            }

            // 前面的 0 的数量还未到达K
            if (record < K) {
                max++;
                record++;
                continue;
            }

            // 前面的 0 的数量已到达K
            if (max > res) {
                res = max;
            }
            max = record;
        }
        // 最后需要在判断一次
        if (max > res) {
            res = max;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] data = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        solution.longestOnes(data,2);
    }
}

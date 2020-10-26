package hot100.最长上升子序列;

/**
 * @Author: XF-DD
 * @Date: 20/09/12 17:40
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] record = new int[nums.length];
        int max = 1;
        record[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && record[j] > temp) {
                    temp = record[j];
                }
            }
            temp++;
            record[i] = temp;
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}

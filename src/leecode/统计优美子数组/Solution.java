package leecode.统计优美子数组;

//https://leetcode-cn.com/problems/count-number-of-nice-subarrays/
public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;

        int l = 0, r = -1, cnt = 0;
        int ans = 0;
        while (r + 1 < n) {
            //来到下一个奇数
            cnt += nums[++r] & 1;
            while (r + 1 < n && cnt < k) cnt += nums[++r] & 1;
            if (r >= n) break;

            int k_cnt_right_begin = r;

            //记录右边有几个偶数
            while (r + 1 < n && (nums[r + 1] & 1) == 0) ++r;

            //记录总个数,l在下一个奇数前每有一个偶数，个数+
            while (l <= r && cnt == k) {
                ans += r - k_cnt_right_begin + 1;
                cnt -= nums[l++] & 1;
            }
        }
        return ans;
    }

    public int numberOfSubarraysByArray(int[] nums, int k) {
       int len = nums.length;
       int index = 0;

       int oddNum = 0;
       int[] record = new int[len+1];

        for (int i = 0; i < len; i++) {
            if(0==(nums[i]&1)) oddNum++;
            else {
                record[index++] = oddNum+1;
                oddNum = 0;
            }
        }
        record[index] = oddNum+1;

        int sum = 0;
        for (int i = 0; i <= index - k; i++) {
            sum += record[i]*record[i+k];
        }
        return sum;
    }
}

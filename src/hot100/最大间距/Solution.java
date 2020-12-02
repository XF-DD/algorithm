package hot100.最大间距;

import java.util.Arrays;

/**
 * @Description https://leetcode-cn.com/problems/maximum-gap/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-26 16:01:42
 */
public class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i-1] > res){
                res = nums[i] - nums[i-1];
            }
        }
        return res;
    }
}

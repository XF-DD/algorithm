package Offer.连续子数组的最大和;

/**
 * @Description https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-13 15:46:33
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int size = nums.length;
        if(size <1){
            return 0;
        }

        if(size <2){
            return nums[0];
        }

        int res = nums[0];

        for (int i = 1; i < size; i++) {
            int sum = nums[i] + nums[i - 1];
            nums[i] = Math.max(sum,nums[i]);
            if(nums[i]>res){
                res = nums[i];
            }
        }
        return res;
    }

}

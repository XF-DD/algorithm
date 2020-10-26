package leecode.最接近的三数之和;

import java.util.Arrays;

/**
 * @Author: XF-DD
 * @Date: 20/06/02 15:38
 */
public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res ;
        if(nums.length == 0){
            return 0;
        }else if(nums.length < 3){
            res = 0;
            for (int i :nums) {
                res += i;
            }
            return res;
        }
        
        Arrays.sort(nums);
        res = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++) {
            int start = i+1;
            int end = nums.length-1;
            while (start<end){
                int sum = nums[start]+nums[end]+nums[i];
                if(Math.abs(target-sum)<Math.abs(target-res)){
                    res = sum;
                }
                if(sum>target){
                    end--;
                }else if(sum<target){
                    start++;
                }else {
                    return res;
                }
            }
        }
        return res;
    }
}

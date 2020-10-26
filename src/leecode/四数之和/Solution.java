package leecode.四数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/06/06 14:40
 * https://leetcode-cn.com/problems/4sum/
 */
public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if(len<3) {
            return  result;
        }

        Arrays.sort(nums);
        for (int j = 0; j<len-3;j++){
            if(j != 0 && nums[j] == nums[j-1]){
                continue;
            }
            for (int i = j+1; i < len-2; i++) {
                if(i!=j+1 && nums[i] == nums[i-1]) {
                    continue;
                }
                int left = i + 1;
                int right = len - 1;
                while (left<right){
                    int sum = nums[i] + nums[left] + nums[right] + nums[j];
                    if( sum == target){
                        result.add(new ArrayList<Integer>(Arrays.asList(nums[j],nums[i],nums[left],nums[right])));
                        while (left<right && nums[left]==nums[++left]);
                        while (left<right && nums[right]==nums[--right]);
                    }
                    else if(sum > target){
                        while(left<right && nums[right]==nums[--right]);
                    }
                    else {
                        while (left<right && nums[left]==nums[++left]);
                    }

                }
            }
        }
        return result;
    }
}

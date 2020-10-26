package leecode.三数之和;

import java.util.*;

//https://leetcode-cn.com/problems/3sum/
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if(len<3) {
            return  result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len && nums[i] <= 0; i++) {
            if(i!=0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1;
            int right = len - 1;
            while (left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if( sum == 0){
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right])));
                    while (left<right && nums[left]==nums[++left]);
                    while (left<right && nums[right]==nums[--right]);
                }
                else if(sum > 0){
                    while(left<right && nums[right]==nums[--right]);
                }
                else {
                    while (left<right && nums[left]==nums[++left]);
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new Solution().threeSum(new int[]{-2,0,0,2,2});
        for (List<Integer> list :
                lists) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }
}

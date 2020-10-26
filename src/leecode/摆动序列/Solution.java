package leecode.摆动序列;

//https://leetcode-cn.com/problems/wiggle-subsequence/
public class Solution {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if(len<2)
            return len;
        int index = 1;
        while (index<len && nums[0]==nums[index]){
            index++;
        }
        if(index == len) return 1;

        int result = 2;
        //记录下一个数应该大于还是小于，大于是true，小于是false
        boolean flag = nums[index] < nums[0];

        while (++index<len){
            if(flag){
                if(nums[index]>nums[index-1]){
                    flag = false;
                    result++;
                }
            }else {
                if(nums[index]<nums[index-1]){
                    flag = true;
                    result++;
                }
            }
        }
        return result;
    }
}

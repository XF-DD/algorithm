package leecode.非递减数列;
//https://leetcode-cn.com/problems/non-decreasing-array/
public class Solution {
    public boolean checkPossibility(int[] nums) {
        int time = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]<=nums[i+1]) continue;
            int temp = nums[i];
            if(i>0){
                nums[i] = nums[i-1];
            }else {
                nums[i] = nums[i+1];
            }

            if(nums[i]>nums[i+1]){
                nums[i] = temp;
                nums[i+1] = temp;
            }
            time++;
            if(time == 2)
                return false;
        }
        return true;
    }
}

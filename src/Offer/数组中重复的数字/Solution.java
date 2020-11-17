package Offer.数组中重复的数字;

/**
 * @Description https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-16 12:31:45
 */
public class Solution {

    public int findRepeatNumber(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i){
                if(nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                //  nums[i] 的值 temp， 则将nums[i] 与 nums[temp]交换
                temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}

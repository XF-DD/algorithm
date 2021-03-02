package Offer.数组中出现次数超过一半的数字;

/**
 * @Description https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-24 15:38:22
 */
public class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length<1){
            return -1;
        }
        if(nums.length<2){
            return nums[0];
        }
        int target = nums[0];
        int record = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == target){
                record++;
            }else {
                record--;
                if(record == 0){
                    target = nums[i];
                    record = 1;
                }
            }
            if(record+i>=nums.length){
                break;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        final int[] i = {1,2};
        i[0]  = 2;

        System.out.println("hello world");
    }
}

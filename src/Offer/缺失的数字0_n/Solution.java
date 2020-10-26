package Offer.缺失的数字0_n;

/**
 * @Author: XF-DD
 * @Date: 20/06/10 11:42
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        if(len<1){
            return 0;
        }

        int left = 0;
        int right = len-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(mid == nums[mid]){
                left = mid+1;
            }else {
                right = mid -1;
            }
        }
        return left;
    }
}

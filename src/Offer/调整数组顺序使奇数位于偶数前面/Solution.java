package Offer.调整数组顺序使奇数位于偶数前面;

/**
 * @Author: XF-DD
 * @Date: 21/03/02 15:56
 */
public class Solution {

    public int[] exchange(int[] nums) {
        int record = 0;
        for (int i = 0; i < nums.length; i++) {
            // 偶数
            if((nums[i] & 1) == 0){
                continue;
            }

            while (record<i && (nums[record]&1)==1){
                record++;
            }

            int temp = nums[i];
            nums[i] = nums[record];
            nums[record] = temp;
        }
        return nums;
    }

}

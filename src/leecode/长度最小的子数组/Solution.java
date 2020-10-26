package leecode.长度最小的子数组;

/**
 * @Author: XF-DD
 * @Date: 20/06/28 11:31
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int length = nums.length;
        int result = length+1;
        for (int i = 0; i < length; i++) {
            int sum = nums[i];
            if(sum >= s){
                return 1;
            }
            for (int j = i+1; j < length ; j++) {
                sum += nums[j];
                if(sum >= s){
                    result = Math.min(result,j-i+1);
                    break;
                }
            }
        }
        return result>length?0:result;
    }
}

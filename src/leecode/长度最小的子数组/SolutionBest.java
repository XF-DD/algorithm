package leecode.长度最小的子数组;

/**
 * @Author: XF-DD
 * @Date: 20/06/28 11:43
 */
public class SolutionBest {
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if(len < 1){return 0;}
        int result = len +1;

        int left = 0;
        int right = 0;
        int sum = nums[0];
        while (left<len){
            if(left == right && sum>s){
                return 1;
            }
            if(sum < s){
                right++;
                if(right == len){
                    break;
                }
                sum+=nums[right];
            }else {
                result = Math.min(result,right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return result>len?0:result;
    }
}

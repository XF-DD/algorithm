package hot100.避免冲突.接雨水;

/**
 * @Description https://leetcode-cn.com/problems/trapping-rain-water/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-13 17:52:23
 */
public class Solution {

    public int trap(int[] height) {
        if(height.length<2){
            return 0;
        }
        int res = 0;
        int leftMax = 0;
        int rightMax = 0;
        int left = 0;
        int right = height.length-1;

        while (left<=right){

            if(leftMax<rightMax){

                if(height[left]>=leftMax){
                    leftMax = height[left];
                }else {
                    res += (leftMax - height[left]);
                }
                left++;

            }else {

                if(height[right]>=rightMax){
                    rightMax = height[right];
                }else {
                    res += (rightMax - height[right]);
                }
                right--;
            }

        }
        return res;
    }
}

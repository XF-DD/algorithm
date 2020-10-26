package leecode._132模式;

import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/06/11 10:32
 */
public class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min[i] = Math.min(nums[i],min[i-1]);
        }

        for (int i = nums.length-1; i >=0 ; i--) {
            while (!stack.isEmpty()&&min[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(nums[i]);
                continue;
            }
            if(nums[i]<=stack.peek()){
                stack.push(nums[i]);
            }else {
                return true;
            }
        }
        return false;
    }
}

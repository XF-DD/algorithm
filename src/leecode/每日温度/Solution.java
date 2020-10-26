package leecode.每日温度;

import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/06/11 10:07
 */
public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[length];
        if(length<1){
            return res;
        }
        for (int i = length-1; i >=0 ; i--) {
            while (!stack.isEmpty()&&T[i] >= T[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i] = 0;
                stack.push(i);
            }else {
                res[i] = stack.peek()-i;
                stack.push(i);
            }
        }
        return res;
    }
}

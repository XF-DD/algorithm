package Offer.栈的压入弹出序列;

import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/06/01 11:57
 * https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/
 */
public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0;
        for (int i = 0; i < pushed.length; i++) {
            int temp = popped[i];
            while (pushIndex<pushed.length && (stack.isEmpty() || stack.peek() != temp)){
                stack.push(pushed[pushIndex]);
                pushIndex++;
            }
            if(stack.peek() == temp){
                stack.pop();
            }else {
                break;
            }
        }

        return stack.isEmpty() && pushIndex == pushed.length;
    }
}

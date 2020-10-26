package leecode.最小栈;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/05/12 13:38
 */
public class Solution {
    class MinStack {
        Stack<Integer> stack;
        Stack<Integer> min;
        public MinStack() {
            stack = new Stack<>();
            min = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if(min.size()==0 || min.peek()>=x){
                min.push(x);
            }
        }

        public void pop() {
            if(stack.size()<1){
               return;
            }
            Integer pop = stack.pop();
            if(pop.equals(min.peek())){
                min.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }
}

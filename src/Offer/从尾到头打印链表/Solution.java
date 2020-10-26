package Offer.从尾到头打印链表;

import Util.ListNode;

import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/08/15 22:08
 */
public class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()){
            res[index++] = stack.pop();
        }
        return res;
    }
}

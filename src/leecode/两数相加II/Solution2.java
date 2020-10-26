package leecode.两数相加II;

import Util.ListNode;

import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/06/11 11:37
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null){
            stack1.push(l1.val);
            l1 =l1.next;
        }
        while (l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode head = new ListNode(0);
        boolean up = false;
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            int pop1 = 0;
            int pop2 = 0;

            if(!stack1.isEmpty()){
                pop1 = stack1.pop();
            }
            if(!stack2.isEmpty()){
                pop2 = stack2.pop();
            }

            int sum = up?pop1+pop2+1:pop1+pop2;
            int res = sum%10;
            up = res!=sum;
            ListNode node = new ListNode(res);
            node.next = head.next;
            head.next = node;
        }
        if(up){
            ListNode node = new ListNode(1);
            node.next = head.next;
            return node;
        }

        return head.next;
    }
}

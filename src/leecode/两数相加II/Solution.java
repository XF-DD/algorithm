package leecode.两数相加II;

import Util.ListNode;

import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/06/11 11:17
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Solution {
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

        long n = 1;
        long res = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            long res1 = 0;
            long res2 = 0;

            if(!stack1.isEmpty()){
                Integer pop = stack1.pop();
                res1 = pop*n;
            }
            if(!stack2.isEmpty()){
                Integer pop = stack2.pop();
                res2 = pop*n;
            }
            res = res + res1 + res2;
            System.out.println(res);
            n*=10;
        }
        System.out.println(res);
        String s = String.valueOf(res);
        ListNode head = new ListNode(0);
        ListNode index = head;
        for (int i = 0; i < s.length(); i++) {
            index.next = new ListNode(s.charAt(i)-48);
            index = index.next;
        }
        return head.next;
    }
}

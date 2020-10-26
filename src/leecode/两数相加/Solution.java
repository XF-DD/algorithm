package leecode.两数相加;

import Util.ListNode;

/**
 * @Author: XF-DD
 * @Date: 20/06/11 11:46
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(1);
        ListNode index = head;
        boolean up = false;
        while (l1 != null || l2 != null){
            int res1 = 0;
            int res2 = 0;

            if (l1 != null){
                res1 = l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                res2 = l2.val;
                l2 = l2.next;
            }

            int sum = up?res1+res2+1:res1+res2;
            int res = sum%10;
            up = res!=sum;
            index.next = new ListNode(res);
            index = index.next;
        }
        if(up){
            index.next = new ListNode(1);
        }
        return head.next;
    }
}

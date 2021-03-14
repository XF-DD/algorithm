package Offer.两个链表的第一个公共节点;

import Util.ListNode;

/**
 * @Description
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-14 16:05:01
 */
public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null ){
            return null;
        }

        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != tempB){
            tempA = tempA == null ? headB : tempA.next;
            tempB = tempB == null ? headA : tempB.next;
        }
        return tempA;
    }
}

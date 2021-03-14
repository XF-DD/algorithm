package Offer.两个链表的第一个公共节点;

import Util.ListNode;

/**
 * @Author: XF-DD
 * @Date: 20/06/10 11:04
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode tempA = headA;
        ListNode tempB = headB;
        boolean flag = false;
        while (tempA != tempB){
            tempA = tempA.next;
            if(tempA == null){
                if(flag){
                    return null;
                }else {
                    tempA = headB;
                    flag = true;
                }
            }
            tempB = tempB.next==null?headA:tempB.next;
        }
        return tempA;
    }
}

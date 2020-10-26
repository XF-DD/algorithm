package Offer.合并两个排序的链表;

import Util.ListNode;

/**
 * @Author: XF-DD
 * @Date: 20/05/12 11:50
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode index = head;
        while (l1!=null && l2!=null){
            if(l1.val<=l2.val){
                index.next = l1;
                l1 = l1.next;
                index = index.next;
            }else {
                index.next = l2;
                l2 = l2.next;
                index = index.next;
            }
        }
        while (l1 != null){
            index.next = l1;
            l1 = l1.next;
            index = index.next;
        }

        while (l2 != null){
            index.next = l2;
            l2 = l2.next;
            index = index.next;
        }
        return head.next;
    }
}

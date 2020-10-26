package Offer.旋转链表;

import Util.ListNode;


/**
 * @Author: XF-DD
 * @Date: 20/09/06 10:50
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        int size = 1;
        ListNode tail = head;
        while (tail.next!=null){
            size++;
            tail = tail.next;
        }

        int i = k%size;
        if(i == 0){
            return head;
        }
        int index = size - i;
        ListNode record = head;
        ListNode pre = record;
        for (int j = 1; j <=index ; j++) {
            pre = record;
            record = record.next;
        }
        pre.next = null;
        tail.next = head;
        return record;
    }
}

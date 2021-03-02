package Offer.反转链表;

import Util.ListNode;

/**
 * @Author: XF-DD
 * @Date: 21/03/02 15:50
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode copyRoot = new ListNode(0);
        while (head!=null){
            root.next = head.next;
            head.next = copyRoot.next;
            copyRoot.next = head;
            head = root.next;
        }
        return copyRoot.next;
    }

}

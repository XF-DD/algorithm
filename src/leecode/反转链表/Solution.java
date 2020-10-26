package leecode.反转链表;

import Util.ListNode;

//https://leetcode-cn.com/problems/reverse-linked-list/
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode root = new ListNode(0);
        ListNode current;
        while (head != null){
            current = head;
            head=  current.next;
            current.next = root.next;
            root.next = current;
        }
        return root.next;
    }
}

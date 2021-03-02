package hot100.删除链表的倒数第N个结点;

import Util.ListNode;

/**
 * @Author: XF-DD
 * @Date: 21/02/19 15:33
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode root = new ListNode(0);
        root.next = head;
        ListNode last = root;
        ListNode index = root;

        for (int i = 0; i < n; i++) {
            last = last.next;
        }

        while (last.next!=null){
            index = index.next;
            last = last.next;
        }

        index.next = index.next.next;

        return root.next;
    }
}

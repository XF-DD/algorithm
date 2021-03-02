package hot100.两两交换链表中的节点;

import Util.ListNode;

/**
 * @Author: XF-DD
 * @Date: 21/02/18 16:34
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode root = new ListNode(0);
        root.next = head;

        ListNode index = root;
        while (index.next !=null && index.next.next != null){
            ListNode temp_1 = index.next;
            ListNode temp_2 = temp_1.next;
            ListNode temp_3 = temp_2.next;

            index.next = temp_2;
            temp_2.next = temp_1;
            temp_1.next = temp_3;

            index = index.next.next;
        }
        return root.next;
    }
}

package leecode.合并两个有序链表;

import Util.ListNode;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 20:52
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode index = node;
        while (l1!=null && l2!=null){
            if(l1.val>l2.val){
                index.next = l2;
                l2 = l2.next;
                index = index.next;
            }else {
                index.next = l1;
                l1 = l1.next;
                index = index.next;
            }
        }
        if(l1 != null){
            index.next = l1;
        }
        if(l2 != null){
            index.next = l2;
        }
        return node.next;
    }
}

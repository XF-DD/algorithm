package Offer.删除链表的节点;

import Util.ListNode;

/**
 * @Author: XF-DD
 * @Date: 20/05/12 13:16
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */
public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode index = first;

        while (head!=null){
            if(head.val == val){
                index.next = head.next;
                break;
            }
            head = head.next;
            index = index.next;
        }
        return first.next;
    }
}

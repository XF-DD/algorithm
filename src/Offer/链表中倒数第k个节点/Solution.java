package Offer.链表中倒数第k个节点;

import Util.ListNode;

/**
 * @Description https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-19 14:23:21
 */
public class Solution {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            if(temp == null){
                return head;
            }
            temp = temp.next;
        }

        while (temp!=null){
            head = head.next;
            temp = temp.next;
        }
        return head;
    }

}

package leecode.从链表中删去总和值为零的连续节点;

import Util.ListNode;

import java.util.HashMap;

//https://leetcode-cn.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/
public class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        if(head == null)
            return null;
        ListNode node = new ListNode(0);
        node.next = head;
        head = node;
        HashMap<Integer, ListNode> map = new HashMap<>();

        int sum = 0;
        while (head!=null){
            sum += head.val;
            map.put(sum,head);
            head = head.next;
        }

        head = node;
        sum = 0;
        while (head!=null){
            sum += head.val;
            head.next = map.get(sum).next;
            head = head.next;
        }
        return node.next;
    }
}

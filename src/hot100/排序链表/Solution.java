package hot100.排序链表;

import Util.ListNode;

/**
 * @Description https://leetcode-cn.com/problems/sort-list/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-12-02 10:30:13
 */
public class Solution {
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);

        // 归并排序
        ListNode root = new ListNode(0);
        ListNode index = root;
        while (left!=null && right!=null){
            if(left.val<right.val){
                index.next = left;
                left = left.next;
            }else {
                index.next = right;
                right = right.next;
            }
            index = index.next;
        }
        while (left!=null){
            index.next = left;
            index = index.next;
            left = left.next;
        }
        while (right!=null){
            index.next = right;
            index = index.next;
            right = right.next;
        }
        return root.next;
    }


}

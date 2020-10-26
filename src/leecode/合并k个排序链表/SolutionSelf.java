package leecode.合并k个排序链表;

import Util.ListNode;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 21:12
 */
public class SolutionSelf {
    public ListNode mergeKLists(ListNode[] lists) {
        return gbpx(lists,0,lists.length-1);
    }

    private ListNode gbpx(ListNode[] lists, int left, int right){
        if(left == right){
            return lists[left];
        }
        int mid = (left+right)/2;
        ListNode leftNode = gbpx(lists, left, mid);
        ListNode rightNode = gbpx(lists, mid + 1, right);

        return merge(leftNode,rightNode);
    }

    private ListNode merge(ListNode node1, ListNode node2){
        ListNode root = new ListNode();
        ListNode index = root;
        while (node1!=null && node2!=null){
            if(node1.val<= node2.val){
                index.next = node1;
                node1 = node1.next;
                index = index.next;
            }else {
                index.next = node2.next;
                node2 = node2.next;
                index = index.next;
            }
        }
        if(node1!=null){
            index.next = node1;
        }
        if(node2!=null){
            index.next = node2;
        }
        return root.next;
    }
}

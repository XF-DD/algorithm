package leecode.合并k个排序链表;

import Util.ListNode;

//https://leetcode-cn.com/problems/merge-k-sorted-lists/
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length <1) return null;
        return gbpx(0,lists.length-1,lists);
    }

    public ListNode gbpx(int left,int right,ListNode[] lists){
        if(left == right) return lists[right];
        int mid = (left+right)/2;
        ListNode leftRoot = gbpx(left, mid, lists);
        ListNode rightRoot = gbpx(mid + 1, right, lists);

        ListNode root = new ListNode(0);
        ListNode next = root;
        while (leftRoot!=null && rightRoot !=null){
            ListNode current;
            if(leftRoot.val>rightRoot.val){
                current = rightRoot;
                rightRoot=rightRoot.next;
            }else {
                current = leftRoot;
                leftRoot=leftRoot.next;
            }
            next.next = current;
            next = next.next;
        }

        if (leftRoot!=null){
            next.next = leftRoot;
        }
        if(rightRoot!=null){
            next.next = rightRoot;
        }

        return root.next;
    }
}



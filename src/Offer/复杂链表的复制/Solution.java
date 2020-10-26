package Offer.复杂链表的复制;

/**
 * @Author: XF-DD
 * @Date: 20/05/12 11:31
 * https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 */
public class Solution {
    public Node copyRandomList(Node head) {
        cloneFirst(head);
        cloneSecond(head);
        return cloneLast(head);
    }

    public void cloneFirst(Node node){
        while (node!=null){
            Node clone = new Node(node.val);
            clone.next = node.next;
            node.next = clone;
            node = clone.next;
        }
    }

    public void cloneSecond(Node node){
        while (node != null){
            if (node.random != null) {
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }
    }

    public Node cloneLast(Node node){
        Node head = new Node(0);
        Node index = head;
        while (node!=null){
            index.next = node.next;
            node.next = node.next.next;
            node = node.next;
            index = index.next;
        }
        return head.next;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

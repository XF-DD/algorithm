package Offer.复杂链表的复制;

/**
 * https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 * @Author: XF-DD
 * @Date: 21/03/01 16:49
 */
public class Solution3 {

    public Node copyRandomList(Node head) {

        Node root = new Node(0);
        root.next = head;

        while (head!=null){
            Node copyNode = new Node(head.val);
            copyNode.next = head.next;
            head.next = copyNode;
            head = copyNode.next;
        }

        Node temp = root.next;

        while (temp!=null){
            if(temp.random!=null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        temp = root.next;
        Node copyRoot = new Node(0);
        Node copyTemp = copyRoot;

        while (temp!=null){
            copyTemp.next = temp.next;
            temp.next = temp.next.next;
            temp = temp.next;
            copyTemp = copyTemp.next;
        }
        return copyRoot.next;
    }

    class Node{
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
        }
    }

}

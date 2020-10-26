package Offer.复杂链表的复制;

/**
 * @Author: XF-DD
 * @Date: 20/08/15 19:50
 */
public class SolutionTwo {
    public Node copyRandomList(Node head) {
        firstCopy(head);
        secondCopy(head);
        return last(head);
    }

    public void firstCopy(Node head){
        while (head != null){
            Node node = new Node(head.val);
            node.next = head.next;
            head.next = node;
            head = node.next;
        }
    }

    public void secondCopy(Node head){
        while (head != null){
            if(head.random!=null){
                head.next.random = head.random.next;
            }
            head = head.next.next;
        }
    }

    public Node last(Node root){
        Node head = new Node(0);
        Node index = head;
        while (root != null){
            index.next = root.next;
            index = index.next;
            root.next = root.next.next;
            root = root.next;
        }
        return head.next;
    }

}


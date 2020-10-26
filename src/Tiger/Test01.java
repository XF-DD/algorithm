package Tiger;

import Util.ListNode;

import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/08/23 16:53
 */
public class Test01 {
    public ListNode lineUp (ListNode head) {
        // write code here
        if(head == null){
            return null;
        }
        ListNode root = head;
        ListNode index = head;
        ListNode pre = root;
        int record = 1;
        while (head != null){
            if(record == 1){
                head = head.next;
                record++;
                continue;
            }

            // 需要换
            if(record %2 == 1){
                ListNode temp = head.next;
                ListNode next = index.next;

                index.next = head;
                head.next = next;

                record++;
                pre.next = temp;
                index = head;
                head = temp;
            }else {
                pre = head;
                record++;
                head = head.next;
            }
        }
        return root;
    }
}

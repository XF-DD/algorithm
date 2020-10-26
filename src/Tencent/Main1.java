package Tencent;


import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int t = Integer.parseInt(s);

        for (int i = 0; i < t; i++) {
            String q = in.nextLine();
            int num = Integer.parseInt(q);
            ListNode root = new ListNode(0);
            int sum = 0;
            ListNode last = root;
            for (int j = 0; j < num; j++) {
                String str = in.nextLine();
                if(str.equals("POP")){
                    if(root.next!=null){
                        root.next=root.next.next;
                        sum--;
                    }
                    else
                        System.out.println(-1);
                }
                else if(str.equals("TOP")){
                    if(root.next!=null)
                        System.out.println(root.next.val);
                    else
                        System.out.println(-1);
                }
                else if(str.equals("SIZE")){
                    System.out.println(sum);
                }
                else if(str.equals("CLEAR")){
                    root.next = null;
                    last = root;
                    sum = 0;
                }
                else{
                    int x = Integer.parseInt(str.substring(5));
                    last.next = new ListNode(x);
                    last = last.next;
                    sum++;
                }

            }

        }

    }

    static class ListNode {
        public int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

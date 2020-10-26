package Meituan;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author: XF-DD
 * @Date: 20/08/22 16:30
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        int orderNum = in.nextInt();
        int resNum = in.nextInt();
        in.nextLine();
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> {
            if(o2.num-o1.num != 0){
                return o2.num-o1.num;
            }
            return o1.id - o2.id;
        });
        for (int i = 1; i <= orderNum ; i++) {
            int v = in.nextInt();
            int w = in.nextInt();
            in.nextLine();
            Node node = new Node();
            node.id = i;
            int num = v + 2*w;
            node.num = num;
            queue.add(node);
        }
        StringBuilder res = new StringBuilder();
        PriorityQueue<Integer> idQueue = new PriorityQueue<>();
        for (int i = 0; i < resNum; i++) {
            idQueue.add(queue.poll().id);
        }

        for (int i = 0; i <resNum-1 ; i++) {
            res.append(idQueue.poll()).append(" ");
        }
        res.append(idQueue.poll());
        System.out.println(res.toString());
    }

    static class Node{
        int id;
        int num;
    }
}

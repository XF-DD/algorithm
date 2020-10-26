package Meituan;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/22 17:04
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        // 一开始都在0号堆
        int[] record = new int[size+1];
        int[] weight = new int[size+1];
        int weightFirst = 0;

        for (int i = 1; i <= size ; i++) {
            weight[i] = in.nextInt();
            weightFirst += weight[i];
        }
        in.nextLine();
        int queueId = 0;
        PriorityQueue<Node> nodeQueue = new PriorityQueue<>((o1, o2) -> o2.num - o1.num);
        HashMap<Integer, Node> map = new HashMap<>();

        Node firstNode = new Node(queueId++, 1, size, weightFirst);
        nodeQueue.add(firstNode);
        map.put(firstNode.id,firstNode);

        for (int i = 0; i < size; i++) {
            int index = in.nextInt();
            Node node = map.get(record[index]);
            record[index] = -1;
            nodeQueue.remove(node);
            map.remove(node.id);

            int leftNum = 0;
            queueId++;
            for (int j = node.startIndex; j < index; j++) {
                leftNum += weight[j];
                record[j] = queueId;
            }
            Node leftNode = new Node(queueId, node.startIndex, index - 1, leftNum);
            nodeQueue.add(leftNode);
            map.put(queueId,leftNode);

            int rightNum = 0;
            queueId++;
            for (int j = node.endIndex; j > index; j--) {
                rightNum += weight[j];
                record[j] = queueId;
            }
            Node rightNode = new Node(queueId, index+1, node.endIndex, rightNum);
            nodeQueue.add(rightNode);
            map.put(queueId,rightNode);

            System.out.println(nodeQueue.peek().num);
        }

    }

    static class Node{
        int id;
        int startIndex;
        int endIndex;
        int num;

        public Node(int id, int startIndex, int endIndex, int num) {
            this.id = id;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.num = num;
        }
    }
}

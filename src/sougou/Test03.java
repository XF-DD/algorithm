package sougou;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * @Author: XF-DD
 * @Date: 20/09/25 19:46
 */
public class Test03 {
    public Interval trim (int N, int M, Interval[] conn) {
        // write code here
        HashMap<Integer, Node> map = new HashMap<>();

        LinkedList<Integer> startList = new LinkedList<>();
        LinkedList<Integer> endList = new LinkedList<>();
        for (Interval item : conn) {
            Node startNode = map.getOrDefault(item.start,new Node());
            Node endNode = map.getOrDefault(item.end,new Node());
            if (item.start == 0){
                endNode.toHead = true;
                startList.add(item.end);
                continue;
            }
            if(item.end == -1){
                startNode.toTail = true;
                endList.add(item.start);
                continue;
            }

            startNode.tailSet.add(item.end);
            endNode.headSet.add(item.start);
        }

        // 遍历计算开头可到达节点
        while (!startList.isEmpty()){
            Integer poll = startList.pollFirst();
            Node node = map.get(poll);
            node.tailSet.forEach(item ->{
                Node newNode = map.get(item);
                if(newNode.toHead){
                    return;
                }
                newNode.toHead = true;
                startList.addLast(item);
            });
        }

        // 遍历计算可到达结尾节点
        while (!endList.isEmpty()){
            Integer poll = startList.pollFirst();
            Node node = map.get(poll);
            node.headSet.forEach(item ->{
                Node newNode = map.get(item);
                if(newNode.toTail){
                    return;
                }
                newNode.toTail = true;
                endList.addLast(item);
            });
        }

        int n = 0;
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            Node node = map.getOrDefault(i,new Node());
            if(node.toTail && node.toHead){
                n++;
                sum+=i;
                sum = sum%100000007;
            }
        }
        Interval interval = new Interval();
        interval.start = n;
        interval.end = sum%100000007;
        return interval;
    }

    static class Node{
        HashSet<Integer> headSet;
        HashSet<Integer> tailSet;
        boolean toHead;
        boolean toTail;

        Node() {
            headSet = new HashSet<>();
            tailSet = new HashSet<>();
            toHead = false;
            toTail = false;
        }
    }

    static class Interval{
        int start;
        int end;
    }
}

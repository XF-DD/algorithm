package shein;

import java.util.*;

/**
 * @Author: XF-DD
 * @Date: 20/09/16 22:54
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        String s = in.nextLine();

        int size = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                Integer integer = map.get(s.charAt(i));
                integer++;
                map.put(s.charAt(i),integer);
            }else {
                map.put(s.charAt(i),1);
            }
        }

        int res = 0;
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.index));
        HashMap<Character, Node> queueMap = new HashMap<>();

        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if(map.containsKey(c)){
                if(size>0){
                    Integer integer = map.get(c);
                    if(integer>0){
                        Node node = new Node(i, c);
                        queue.add(node);
                        queueMap.put(c,node);
                        integer--;
                        map.put(c,integer);
                        size--;
                        if(size == 0){
                            res = i - queue.peek().index+1;
                        }
                    }
                }else {
                    Node node = queueMap.get(c);
                    Node newNode = new Node(i, c);
                    if(node == queue.peek()){
                        Node poll = queue.poll();
                        int i1 = i - queue.peek().index;
                        if(res>i1){
                            res = i1;
                        }
                    }
                }
            }

        }
        System.out.println(res);
    }

    static class Node{
        int index;
        char c;

        public Node(int index, char c) {
            this.index = index;
            this.c = c;
        }
    }

    private static int count(HashMap<Character, Integer> dtoMap,int index,String data,int size){
        HashMap<Character, Integer> map = new HashMap<>(dtoMap);
        for (int i = index; i < data.length(); i++) {
            char c = data.charAt(i);

        }
        return 0;
    }
}

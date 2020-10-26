package Offer.队列的最大值;

import java.util.LinkedList;

//https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/
public class Solution {
    class MaxQueue {

        LinkedList<Integer> list;
        LinkedList<Integer> maxList;

        public MaxQueue() {
            list = new LinkedList<>();
            maxList = new LinkedList<>();
        }

        public int max_value() {
            if(maxList.isEmpty())
                return -1;
            return maxList.peek();
        }

        public void push_back(int value) {
            list.offer(value);

            while (!maxList.isEmpty() && maxList.peekLast()<=value)
                maxList.pollLast();
            maxList.offer(value);
        }

        public int pop_front() {
            if(list.isEmpty())
                return -1;
            int poll = list.poll();
            if(poll == maxList.peek())
                maxList.poll();
            return poll;
        }
    }

    public static void main(String[] args) {
        String s = "5";
        String s3 = "3";
        int i = s.compareTo(s3);
        System.out.println(i);

    }
}

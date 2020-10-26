package Offer.数据流中的中位数;
import java.util.PriorityQueue;
//https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/submissions/
public class Solution {
    class MedianFinder {
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        /** initialize your data structure here. */
        public MedianFinder() {
            //大根堆
            left = new PriorityQueue<>((o1, o2) -> o2-o1);
            //小根堆
            right = new PriorityQueue<>((o1, o2) -> o1-o2);
        }

        public void addNum(int num) {
            if(left.size() == 0 ){
               left.add(num);
               adjust();
           }
           else {
               if(num<=left.peek()){
                   left.add(num);
                   adjust();
               }else {
                   right.add(num);
                   adjust();
               }
           }
        }

        public void adjust(){
            if(left.size()-right.size()>1)
                right.add(left.poll());
            else if(right.size()-left.size()>1)
                left.add(right.poll());
        }


        public double findMedian() {
            if(right.size() == 0)
                return left.peek();

            if(left.size()>right.size())
                return left.peek();
            else if(right.size()>left.size())
                return right.peek();
            else
                return (left.peek()+right.peek())/2.00000;
        }
    }
}

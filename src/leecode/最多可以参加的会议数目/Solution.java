package leecode.最多可以参加的会议数目;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

//https://leetcode-cn.com/problems/maximum-number-of-events-that-can-be-attended/

/**
 * 1. 排序数组
 * 2. 从第一天开始算，直到数组所有元素遍历完成
 * 3. 将这一天开始的所有元素的结束日子放入优先队列（小顶堆）
 * 4. 将队列里已有的但是已经小于开始日期的poll掉
 * 5. 验证，若队伍非空，则poll出第一个，结果+1
 * 6. 总结：现按照开始日期加入，按照结束日期执行会议
 */
public class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if( o1[0] !=o2[0]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int result = 0, index = 0, len = events.length,start = 1;
        while (index<len || !queue.isEmpty()){
            while (index < len && events[index][0] == start){
                queue.add(events[index][1]);
                index++;
            }

            while (!queue.isEmpty() && queue.peek() < start)
                queue.poll();

            if(!queue.isEmpty()){
                queue.poll();
                result++;
            }
            start++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2},{1,2},{3,3},{1,6},{1,5}};
        int i = new Solution().maxEvents(a);
        System.out.println(i);

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        queue.add(6);

        queue.add(2);
        queue.add(4);
        queue.add(5);
        queue.add(7);
        queue.add(9);
        queue.add(10);
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue .poll());
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue .poll());
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue .poll());
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue .poll());
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue .poll());
        System.out.println(Arrays.toString(queue.toArray()));
    }
}

package Offer.滑动窗口的最大值;

import java.util.LinkedList;

// https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if(len<1 || k<1)
            return new int[]{0};
        LinkedList<Integer> deque = new LinkedList<>();
        int[] result = new int[len - k + 1];
        for (int i = 0-k+1, j = 0; j<len ;i++, j++) {
            if(i>0 && deque.peek() == j-k) deque.poll();
            while (!deque.isEmpty() && nums[j]>=nums[deque.peekLast()]) deque.pollLast();
            deque.add(j);
            if(i>=0) result[i] = nums[deque.peek()];
        }
        return result;
    }
}

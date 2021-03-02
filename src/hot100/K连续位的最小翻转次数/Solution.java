package hot100.K连续位的最小翻转次数;

import java.util.LinkedList;

/**
 * @Author: XF-DD
 * @Date: 21/02/18 16:18
 */
public class Solution {
    public int minKBitFlips(int[] A, int K) {
        int res = 0;
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < A.length; i++) {
            if(queue.size()>0 && i - queue.peek()>=K){
                queue.pollFirst();
            }

            if(queue.size()%2 == A[i]){
                if(i+K>A.length){
                    return -1;
                }
                res++;
                queue.addLast(i);
            }
        }
        return res;
    }
}

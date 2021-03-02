package hot100.最大连续1的个数III;

import sun.awt.image.ImageAccessException;

import java.util.LinkedList;

/**
 * @Author: XF-DD
 * @Date: 21/02/19 15:12
 */
public class SolutionRight {

    public int longestOnes(int[] A, int K) {

        int res = 0;
        int max = 0;
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < A.length; i++) {

            if(A[i] == 1){
                max++;
                continue;
            }

            if(queue.size()<=K){
                queue.addLast(i);
                max++;
            }

            if(queue.size()>K){
                max--;
                if(max>res){
                    res = max;
                }

                Integer first = queue.pollFirst();
                max = i - first;
            }

        }

        if(max>res){
            res = max;
        }

        return res;

    }

}

package hot100.课程表;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Author: XF-DD
 * @Date: 20/06/21 12:13
 * https://leetcode-cn.com/problems/course-schedule/
 */
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses<2){
            return true;
        }

        // 课程前置数
        int[] result = new int[numCourses];
        for (int[] p : prerequisites) {
            result[p[0]]++;
        }

        // 已完成课程数
        int num = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(result[i] == 0){
                queue.add(i);
                num++;
            }
        }

        while (!queue.isEmpty()){
            Integer poll = queue.poll();
            for (int[] p:prerequisites) {
                if(poll == p[1]){
                    result[p[0]]--;
                    if(result[p[0]] == 0){
                        queue.add(result[p[0]]);
                        num++;
                    }
                }
            }
        }
        return num == numCourses;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //3
        //[[1,0],[2,1]]
        int[][] a = {{1,0},{2,1}};
        System.out.println(solution.canFinish(3,a));
    }


}

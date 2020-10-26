package hot100.课程表;

import java.util.LinkedList;

/**
 * @Author: XF-DD
 * @Date: 20/08/16 11:23
 */
public class SolutionBySelf {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses < 2){
            return true;
        }

        int[] result = new int[numCourses];
        for (int[] p : prerequisites) {
            result[p[0]]++;
        }

        // 已完成课程数
        int num = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(result[i] == 0){
                queue.addLast(i);
                num++;
            }
        }

        while (!queue.isEmpty()){
            Integer poll = queue.pollFirst();
            for (int[] p : prerequisites) {
                if(poll == p[1]){
                    result[p[0]]--;
                    if(result[p[0]] == 0){
                        queue.addLast(result[p[0]]);
                        num++;
                    }
                }
            }
        }
        return num == numCourses;
    }
}

package leecode.课程表II;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/05/18 0:07
 */
public class Solution2 {
    private int k = 0;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //记录前置
        int[] in = new int[numCourses];
        //答案
        int[] ans = new int[numCourses];
        //
        List[] edges = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i ++) {
            edges[i] = new ArrayList<Integer>();
        }
        for (int[] pre : prerequisites) {
            //前置课程数+1
            in[pre[0]] ++;
            //该门课是哪些课的基础
            edges[pre[1]].add(pre[0]);
        }
        for (int i = 0; i < numCourses; i ++) {
            if (in[i] == 0) {
                ans[k ++] = i;
                in[i] = -1;
                topologicalSorting(edges, edges[i], in, ans);
            }
        }
        //是否达到课程数
        return k == numCourses ? ans : new int[0];
    }

    private void topologicalSorting(List[] edges, List<Integer> list, int[] in, int[] ans) {
        for (int course : list) {
            //队列里的课程前置数都-1
            in[course] --;
            //如果有为0的，加入答案队列，并从它开始
            if (in[course] == 0) {
                ans[k ++] = course;
                in[course] = -1;
                topologicalSorting(edges, edges[course], in, ans);
            }
        }
    }
}

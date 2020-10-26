package leecode.课程表II;

import java.util.LinkedList;

/**
 * @Author: XF-DD
 * @Date: 20/05/17 23:30
 * https://leetcode-cn.com/problems/course-schedule-ii/
 */
public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //拓扑算法
        if(numCourses == 0 ){
            return new int[0];
        }

        //记录每个节点(每节课)有多少个前置节点
        int[] record = new int[numCourses];
        for (int[] p : prerequisites) {
            record[p[0]]++;
        }

        //将前置节点为0的加入队列
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(record[i] == 0){
                queue.add(i);
            }
        }

        //记录可以完成的课的数量
        int count = 0;
        //可以学完的课程
        int[] result = new int[numCourses];

        while (!queue.isEmpty()){
            Integer poll = queue.poll();
            result[count++] = poll;
            /*for (int i = 0; i < numCourses; i++) {
                if(prerequisites[i][1] == poll){
                    record[prerequisites[i][0]] --;
                    if(prerequisites[i][0] == 0){
                        queue.add(prerequisites[i][0]);
                    }
                }
            }*/
            for (int[] p : prerequisites) {
                if(p[1] == poll){
                    record[p[0]]--;
                    if(record[p[0]] == 0){
                        queue.add(p[0]);
                    }
                }
            }
        }
        if(count != numCourses){
            return new int[0];
        }
        return result;
    }
}

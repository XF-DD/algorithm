package leecode.合并区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<2)
            return intervals;
        int len = intervals.length;
        //数组按行排列，即按照第一个下标的第一个数排列
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));

        ArrayList<int[]> result = new ArrayList<>();
        result.add(intervals[0]) ;

        for (int i = 1 ; i <len ; i++) {
            int[] peek = result.get(result.size() - 1);
            if(peek[1]<intervals[i][0])//前一个后一位比后一个前一位小，说明区间不重合
                result.add(intervals[i]);
            else
                peek[1] = Math.max(peek[1], intervals[i][1]);
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = solution.merge(intervals);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}

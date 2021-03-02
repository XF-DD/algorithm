package 区域和检索数组不可变;

import java.util.ArrayList;

/**
 * https://leetcode-cn.com/problems/range-sum-query-immutable/
 * @Author: XF-DD
 * @Date: 21/03/01 14:32
 */

public class NumArray {

    private ArrayList<Integer> numList;
    private ArrayList<Integer> recordList;

    public NumArray(int[] nums) {
        int front = 0;
        numList = new ArrayList<>();
        recordList = new ArrayList<>();
        for (int i : nums) {
            numList.add(i);
            recordList.add(front);
            front += i;
        }
    }

    public int sumRange(int i, int j) {
        return recordList.get(j) - recordList.get(i) + numList.get(j);
    }
}

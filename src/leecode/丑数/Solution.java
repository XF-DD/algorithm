package leecode.丑数;

import java.util.Arrays;
import java.util.HashSet;

//https://leetcode-cn.com/problems/ugly-number-ii/
public class Solution {
    public int nthUglyNumber(int n) {
        if(n<1)
            return 0;
        if(n>1690)
            n = 1690;
        int[] record = new int[n];
        record[0] = 1;
        int num2 = 0;
        int num3 = 0;
        int num5 = 0;
        for (int i = 1; i < n;i++) {
            int ugly =Math.min(Math.min(record[num2]*2,record[num3]*3),record[num5]*5); ;
            if(ugly == record[num2]*2) num2++;
            if(ugly == record[num3]*3) num3++;
            if(ugly == record[num5]*5) num5++;
            record[i] = ugly;
        }
        return record[n-1];
    }

    public static void main(String[] args) {
        new Solution().nthUglyNumber(10);
    }
}

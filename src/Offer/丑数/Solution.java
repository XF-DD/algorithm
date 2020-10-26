package Offer.丑数;

//https://leetcode-cn.com/problems/chou-shu-lcof/
public class Solution {
    public int nthUglyNumber(int n) {
        if(n == 1)
            return 1;
        if(n>1690) n = 1690;
        int [] record = new int[n+1];
        record[1] = 1;
        int num2 = 1;
        int num3 = 1;
        int num5 = 1;
        for (int i = 2; i < n+1; i++) {
            int ugly = Math.min(record[num2]*2,Math.min(record[num3]*3,record[num5]*5));
            record[i] = ugly;
            if(ugly == record[num2]*2) num2++;
            if(ugly == record[num3]*3) num3++;
            if(ugly == record[num5]*5) num5++;
        }
        return record[n];
    }
}

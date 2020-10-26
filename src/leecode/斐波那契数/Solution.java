package leecode.斐波那契数;

import java.util.ArrayList;

//https://leetcode-cn.com/problems/fibonacci-number/
public class Solution {
    public int fib(int N) {
        if(N == 0)
            return 0;
        if(N == 1)
            return 1;
        int diff2 = 0;
        int diff1 = 1;
        for (int i = 2; i < N; i++) {
            diff1 = diff1+diff2;
            diff2 = diff1-diff2;
        }
        return diff1+diff2;
    }
}

package Offer.剪绳子;

//https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
public class Solution {
    public int cuttingRope(int n) {
        if(n == 2) {
            return 1;
        }
        if(n == 3) {
            return 2;
        }
        int num = n/3;
        int leaf = n%3;

        if(leaf == 0) {
            return (int) Math.pow(3,num);
        } else if (leaf == 1) {
            return (int)Math.pow(3,num-1)*4;
        } else {
            return (int) Math.pow(3,num)*2;
        }
    }

    public int dtgh(int n){
        if(n == 2) {
            return 1;
        }
        if(n == 3) {
            return 2;
        }

        int[] record = new int[n+1];
        record[0] = 0;
        record[1] = 1;
        record[2] = 2;
        record[3] = 3;
        for (int i = 4; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= i/2 ; j++) {
                int temp = record[j] * record[i-j];
                if(max<temp) {
                    max = temp;
                }
            }
            record[i] = max;
        }
        return record[n];
    }
}

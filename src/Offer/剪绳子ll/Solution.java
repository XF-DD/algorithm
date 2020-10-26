package Offer.剪绳子ll;

//https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/
public class Solution {
    public int cuttingRope(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        int mod = 1000000007;
        int num3 = n/3;
        int rem = n%3;

        if(rem == 0)
            return (int) ((Math.pow(3,num3))%mod);
        else if(rem == 1)
            return (int) ((Math.pow(3,num3-1)*4)%mod);
        else
            return (int) ((Math.pow(3,num3)*2)%mod);
    }

    public int cuttingRope2(int n) {
        if(n == 2)
            return 1;
        if(n == 3)
            return 2;
        long res = 1;
        while(n > 4){
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int)(res * n % 1000000007);
    }
}

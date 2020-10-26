package Offer.数值的整数次方;

//https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
public class Solution {
    public double myPow(double x,int n){
        long l = n;
        if (l<0){
            l = -l;
            x = 1/x;
        }

        return myPow(x,l);
    }

    /**
     * n偶数: a^n = a^(n/2) * a^(n/2)
     * n奇数；a^n = a^(n/2) * a^(n/2) * a
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x, long n) {
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return x;
        }

        double result = myPow(x, n >> 1);
        result *= result;
        if( (n&1) == 1) {
            result*=x;
        }
        return result;
    }
}

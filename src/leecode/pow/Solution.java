package leecode.pow;

/**
 * @Author: XF-DD
 * @Date: 20/05/11 11:47
 */
public class Solution {
    /**
     * n偶数: a^n = a^(n/2) * a^(n/2)
     * n奇数；a^n = a^(n/2) * a^(n/2) * a
     * @param x
     * @param n
     * @return
     */
    public double myPow(double x,int n){
        long l = n;
        if(l<0){
            l = -l;
            x = 1/x;
        }
        return myPow(x,l);
    }

    public double myPow(double x, long n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }

        double result = myPow(x,n>>1);
        result *=result;
        if((n & 1) != 0){
            result *= x;
        }
        return result;
    }
}

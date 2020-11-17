package Offer.数值的整数次方;

/**
 * @Description https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-16 18:37:05
 */
public class Solution2 {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 1 / x * myPow(1 / x, -n - 1);
        }
        return n%2 == 0 ? myPow(x*x,n/2) : myPow(x*x,n/2)*x;
    }
}

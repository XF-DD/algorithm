package leecode.圆圈中最后剩下的数字;

/**
 * @Author: XF-DD
 * @Date: 20/06/09 11:41
 * https://leetcode-cn.com/problems/yuan-quan-zhong-zui-hou-sheng-xia-de-shu-zi-lcof/
 * P303
 * f(n,m)表示n个数字，每次移出第m个，最后剩下的数
 * f(n,m) = {
 *     0,n=1;
 *     f[(n-1,m)+m]%n,n>1;
 * }
 */
public class Solution {
    public int lastRemaining(int n, int m) {
        if (n<1 || m<1){
            return -1;
        }
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last+m)%i;
        }
        return last;
    }
}

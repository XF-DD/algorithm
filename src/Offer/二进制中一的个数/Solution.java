package Offer.二进制中一的个数;

/**
 * @Description https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-17 13:53:56
 */
public class Solution {
    public int hammingWeight(int n) {
        int num = 0;
        while (n!=0){
            if( (n&1) == 1){
                num++;
            }
            n>>>=1;
        }
        return num;
    }
}

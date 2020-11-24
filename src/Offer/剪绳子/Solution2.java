package Offer.剪绳子;

/**
 * @Description https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-17 13:45:29
 */
public class Solution2 {
    public int cuttingRope(int n) {
        if(n == 2){
            return 1;
        }
        if(n == 3){
            return 2;
        }
        int num = n/3;
        int leaf = n%3;
        if(leaf == 0){
            return (int) Math.pow(3,num);
        }else if(n%3 == 1){
            return (int) (Math.pow(3,num-1)*4);
        }
        return (int) (Math.pow(3,num)*2);
    }
}

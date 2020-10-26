package leecode.只出现一次的数字;

/**
 * @Author: XF-DD
 * @Date: 20/06/10 10:33
 * https://leetcode-cn.com/problems/single-number-ii/solution/zhi-chu-xian-yi-ci-de-shu-zi-ii-by-leetcode/
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
        int record = 0;
        for (int num : nums) {
            record ^= num;
        }

        int n = 1;
        while ((record&n) != n){
            n = n<<1;
        }

        int res1 = 0;
        int res2 = 0;
        for (int num :nums) {
            if((num&n)==n){
                res1 ^= num;
            }else {
                res2 ^= num;
            }
        }
        return new int[]{res1, res2};
    }
}

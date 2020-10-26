package leecode.只出现一次的数字II;

/**
 * @Author: XF-DD
 * @Date: 20/06/10 10:33
 * https://leetcode-cn.com/problems/single-number-ii/solution/zhi-chu-xian-yi-ci-de-shu-zi-ii-by-leetcode/
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int once = 0;
        int twice = 0;

        for (int num : nums) {
            once = ~twice&(once^num);
            twice = ~once&(twice^num);
        }
        return once;
    }
}

package leecode.数字序列中某一位的数字;

/**
 * @Author: XF-DD
 * @Date: 20/05/28 11:44
 * 数学题
 * https://leetcode-cn.com/problems/shu-zi-xu-lie-zhong-mou-yi-wei-de-shu-zi-lcof/solution/mian-shi-ti-44-shu-zi-xu-lie-zhong-mou-yi-wei-de-6/
 */
public class Solution {
        public int findNthDigit(int n) {
            int digit = 1;
            long start = 1;
            long count = 9;
            while (n > count) { // 1.
                n -= count;
                digit += 1;
                start *= 10;
                count = digit * start * 9;
            }
            long num = start + (n - 1) / digit; // 2.
            return Long.toString(num).charAt((n - 1) % digit) - '0'; // 3.
        }
}

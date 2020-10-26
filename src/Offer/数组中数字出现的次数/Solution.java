package Offer.数组中数字出现的次数;

import java.util.Arrays;

//https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
public class Solution {
    public int[] singleNumbers(int[] nums) {
        int result = 0;
        for (int i :nums) {
            result ^= i;
        }
        int index = 1;
        while ((result&index) == 0){
            index <<= 1;
        }
        System.out.println(index);

        int res0 = 0;
        int res1 = 0;
        for (int i :nums) {
            if((i & index) == 0)
                res0 ^= i;
            else
                res1 ^= i;
        }
        return new int[]{res0,res1};
    }

    public static void main(String[] args) {
        int[] ints = new Solution().singleNumbers(new int[]{1,2,5,2});
        System.out.println(Arrays.toString(ints));
    }
}

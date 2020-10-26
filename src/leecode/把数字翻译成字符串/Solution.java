package leecode.把数字翻译成字符串;

/**
 * @Author: XF-DD
 * @Date: 20/06/09 10:39
 * https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/
 */
public class Solution {
    public int translateNum(int num) {
        int n = 0;
        int temp = num;
        while (temp!=0){
            n++;
            temp/=10;
        }
        return count(num,n);
    }

    public int count(int num , int n){
        if(n <2){
            return 1;
        }
        // 前一位
        int num1 = (int) (num%Math.pow(10,n-1));
        int res1 = count(num1,n-1);
        //第一位是0
        if(num<Math.pow(10,n-1)){
            return res1;
        }
        // 前两位
        int front = (int) (num/(Math.pow(10,n-2)));
        int res2 = 0;
        if(front<26){
            int num2 = (int) (num%Math.pow(10,n-2));
            res2 = count(num2,n-2);
        }
        return res1+res2;
    }
}

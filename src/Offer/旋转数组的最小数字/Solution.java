package Offer.旋转数组的最小数字;

/**
 * @Author: XF-DD
 * @Date: 20/05/12 13:20
 * https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/
 */
public class Solution {
    public int minArray(int[] numbers) {
        if(numbers.length<1) {
            return 0;
        }

        int left = 0;
        int right = numbers.length-1;

        while (left<right){
            int mid = (left+right)/2;
            if(numbers[mid]>numbers[right]){
                left = mid+1;
            }else if(numbers[mid]<numbers[right]){
                right = mid;
            }else {
                right--;
            }
        }
        return numbers[left];
    }
}

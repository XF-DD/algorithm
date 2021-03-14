package hot100.下一个排列;

import java.util.Iterator;

/**
 * @Author: XF-DD
 * @Date: 20/08/22 12:33
 */
public class Solution  {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i>=0){
            if(nums[i] >= nums[i+1]){
                i--;
            }else {
                break;
            }
        }

        if(i<0){
            // 最大数，直接反转
            reserve(nums,0);
            return;
        }

        // 找出比i大的下一个数
        int j = nums.length - 1;
        while (nums[j]<=nums[i]){
            j--;
        }

        swap(nums,i,j);
        // 翻转i以后所有数
        reserve(nums,i+1);

    }

    private void reserve(int[] nums, int left) {
        int right = nums.length - 1;
        while (left <right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }

    private void swap(int[] data,int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

    }
}

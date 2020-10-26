package base.快速排序;

import java.util.Arrays;

/**
 * @Author: XF-DD
 * @Date: 20/08/26 11:55
 */
public class Solution {
    public int[] fast(int[] number){
        fast(number,0,number.length-1);
        return number;
    }

    private void fast(int[] number, int left, int right){
        int index = left;
        int target = left;
        int mid = number[right];
        while (index<right){
            if(number[index]<mid){
                int temp = number[target];
                number[target] = number[index];
                number[index] = temp;
                target++;
            }
            index++;
        }
        number[right] = number[target];
        number[target] = mid;
        if(target-left>=2){
            fast(number,left,target-1);
        }
        if(right-target>=2){
            fast(number,target+1,right);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1, 5, 3, 7, 2, 10};
        System.out.println(Arrays.toString(solution.fast(ints)));
    }
}

package sort.快速排序;

import java.util.Arrays;

/**
 * @Description 快速排序
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-11 12:17:30
 */
public class Solution {

    public void quickSort(int[] arr,int left,int right){

        int index = left;
        int target = left;
        int temp;
        int pivot = arr[right];
        for(;index<right;index++){
            if(arr[index]<pivot){
                if(index!=target){
                    temp = arr[index];
                    arr[index] = arr[target];
                    arr[target] = temp;
                }
                target++;
            }
        }
        arr[right] = arr[target];
        arr[target] = pivot;

        System.out.print("pivot:" + pivot);
        System.out.println(Arrays.toString(arr));

        if(target - left >= 2){
            quickSort(arr,left,target-1);
        }

        if(right - target >= 2){
            quickSort(arr,target+1,right);
        }

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 91, 5, 3, 78, 2, 9};
        solution.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}

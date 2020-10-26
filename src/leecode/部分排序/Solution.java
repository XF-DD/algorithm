package leecode.部分排序;

//https://leetcode-cn.com/problems/sub-sort-lcci/
public class Solution {
    public int[] subSort(int[] array) {
        int len = array.length;
        if(len<3)
            return new int[]{-1,-1};

        int leftRecord = 0;
        int rightRecord = 0;
        int left = 0;
        int right = len-1;
        int temp = array[right]-array[left];
        //递增
        if(temp>=0){
            while (array[left]<=array[right]){
                if(left == 0 ){
                    if(array[left]<=array[left+1])
                        left++;
                }else {
                    if(array[left]>=array[left-1])
                        left++;
                }

                if(right == len -1){
                    if(array[right]>=array[right-1]&&array[right]>=array[left])
                        right--;
                }else {
                    if(array[right]<=array[right+1])
                        right--;
                }

                leftRecord = array[left] == array[leftRecord]?leftRecord:left;
                rightRecord = array[right] == array[rightRecord]?rightRecord:right;
            }
            if(left<right)
                return new int[]{leftRecord,rightRecord};
        }
        //递减
        else {
            while (array[left]>=array[right]){
                if(left == 0 ){
                    if(array[left]>=array[left+1])
                        left++;
                }else {
                    if(array[left]<=array[left-1])
                        left++;
                }

                if(right == len -1){
                    if(array[right]<=array[right-1])
                        right--;
                }else {
                    if(array[right]>=array[right+1])
                        right--;
                }
                leftRecord = array[left] == array[leftRecord]?leftRecord:left;
                rightRecord = array[right] == array[rightRecord]?rightRecord:right;
            }
            if(left<right)
                return new int[]{leftRecord,rightRecord};
        }
        return new int[]{-1,-1};
    }
}

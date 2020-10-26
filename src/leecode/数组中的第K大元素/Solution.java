package leecode.数组中的第K大元素;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 20:34
 */
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        buildMaxHeap(nums,heapSize);
        for (int i = nums.length-1; i >=nums.length-k+1 ; i--) {
            swap(nums,0,i);
            heapSize--;
            maxHeapChange(nums,0,heapSize);
        }
        return nums[0];
    }

    private void buildMaxHeap(int[] a,int heapSize){
        for (int i = heapSize/2; i >=0 ; i--) {
            maxHeapChange(a,i,heapSize);
        }
    }

    public void maxHeapChange(int[] a, int i, int heapSize){
        int l = i*2+1;
        int r = i*+2;
        int largest = i;
        if(l<heapSize && a[l]>a[largest]){
            largest = l;
        }
        if(r<heapSize && a[r] > a[largest]){
            largest = r;
        }
        if(largest == i){
            return;
        }
        swap(a,largest,i);
        maxHeapChange(a,largest,heapSize);
    }

    public void swap(int[] a , int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}

package Offer.最小的k个数;

/**
 * @Author: XF-DD
 * @Date: 20/06/17 17:59
 */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k>=arr.length){
            return arr;
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            int min = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            res[i] = arr[min];
            arr[min] = Integer.MAX_VALUE;
        }
        return res;
    }

}

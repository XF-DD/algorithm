package leecode.转变数组后最接近目标值的数组和;

import java.util.Arrays;

/**
 * @Author: XF-DD
 * @Date: 20/06/14 10:55
 */
public class Solution_twice {
    public int findBestValue(int[] arr, int target) {
        int len = arr.length;
        Arrays.sort(arr);
        int index = 0;
        int temp = 0;
        for (; index < arr.length; index++) {
            if((len - index)*arr[index] + temp >= target){
                break;
            }
            temp += arr[index];
        }

        if(index == 0){
            int i1 = target / len;
            int i2 = i1 + 1;
            return Math.abs(target-i1*len)<Math.abs(target-i2*len)?i1:i2;
        }

        if(index == len){
            return arr[len-1];
        }

        int front = index-1;
        int last = index;
        int newTar = target - temp;
        int num = len - last;
        int record = num * arr[front]-arr[front];
        for (int i = 0; i <= last-front ; i++) {
            temp = record + num;
            if(temp>=newTar){
                return Math.abs(newTar-record)<Math.abs(newTar-temp)?arr[front]-1:arr[front];
            }
            record = temp;
        }
        return arr[last];
    }
}

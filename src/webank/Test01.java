package webank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/09/27 18:56
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int time = in.nextInt();
        in.nextLine();

        int[] data = new int[length];
        for (int i = 0; i < length; i++) {
            data[i] = in.nextInt();
        }
        in.nextLine();
        Arrays.sort(data);
        for (int i = 0; i < time; i++) {
            int n = in.nextInt();
            int res = check(data,n);
            System.out.println(res);
        }
    }

    private static int check(int[] data, int n) {
        int left = 0;
        int right = data.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(data[mid] == n){
                return n;
            }
            if(data[mid]<n){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }

        if(left == data.length){
            return data[left-1];
        }
        if(right == -1){
            return data[0];
        }
        int diff1 = Math.abs(data[left] - n);
        int diff2 = Math.abs(data[right] - n);
        if(diff1 != diff2){
            return diff1>diff2?data[right]:data[left];
        }
        return Math.min(data[left],data[right]);
    }
}

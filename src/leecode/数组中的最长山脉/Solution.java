package leecode.数组中的最长山脉;

//https://leetcode-cn.com/problems/longest-mountain-in-array/
public class Solution {
    public int longestMountain(int[] A) {
        if(A.length<3) return 0;
        boolean up = false;
        int temp = 0;
        int count = 0;
        int max = 0;
        for (int i = 1; i < A.length; i++) {
            if(A[i]==A[i-1]){
                up = true;
                count = 0;
                temp = 0;
            }
            if(A[i]>A[i-1]){
                if(up){
                    temp++;
                }else {
                    up = true;
                    temp = 1;
                    count = 0;
                }
            }
            else {
                if(up){
                    if(temp>max){
                        up = false;
                        count = temp;
                        temp--;
                    }else {
                        temp = 0;
                    }
                }else {
                    if(temp>0)
                        temp--;
                }
                if(count>0 && temp == 0){
                    up = true;
                    max = count;
                    count = 0;
                }
            }
        }
        return max;
    }
}

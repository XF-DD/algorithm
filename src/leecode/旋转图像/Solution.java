package leecode.旋转图像;

//https://leetcode-cn.com/problems/rotate-image/
public class Solution {
    public void rotate(int[][] matrix) {
        jump(0,matrix.length,matrix);
    }

    /**
     *  0 1 2  3/2=1
     *  0 1 2 3 4/2 = 2
     *  0 1 2 3 4  5/2 = 2
     */
    public void jump(int min,int len,int[][] matrix){
        int max = min + len - 1;
        int temp = matrix[min][min];
        matrix[min][min] = matrix[max][min];
        matrix[max][min] = matrix [max][max];
        matrix[max][max] = matrix[min][max];
        matrix[min][max] = temp;
        for (int i = 1; i < len-1; i++) {
            temp = matrix[min][min+i];
            matrix[min][min+i] = matrix[max-i][min];
            matrix[max-i][min] = matrix[max][max-i];
            matrix[max][max-i] = matrix[min+i][max];
            matrix[min+i][max] = temp;
        }
        if(len-2>1)
            jump(min+1,len-2,matrix);
    }
}

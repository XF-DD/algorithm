package zhuanzhuan;

import leecode.最多可以参加的会议数目.Solution;

import java.util.Arrays;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 15:56
 */
public class Test02 {
    public void rotate(int[][] matrix){
        int length = matrix.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][length-1-j];
                matrix[i][length-1-j] = temp;

            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        Test02 solution = new Test02();
        int[][] ints = new int[3][3];
        ints[0] = new int[]{1,2,3};
        ints[1] = new int[]{4,5,6};
        ints[2] = new int[]{7,8,9};
        solution.rotate(ints);
    }

}

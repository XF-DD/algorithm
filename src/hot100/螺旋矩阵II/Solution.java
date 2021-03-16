package hot100.螺旋矩阵II;

/**
 * @Description https://leetcode-cn.com/problems/spiral-matrix-ii/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-16 10:51:22
 */
public class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int top = 0;
        int right = n-1;
        int down = n-1;
        int[][] res = new int[n][n];
        int num = 1;

        while (num<=n*n){
            for (int i = left; i <= right; i++) {
                res[top][i] = num++;
            }
            top++;

            for (int i = top; i <= down; i++) {
                res[i][right] = num++;
            }
            right--;

            for (int i = right; i >=left ; i--) {
                res[down][i] = num++;
            }
            down--;

            for (int i = down; i >= top ; i--) {
                res[i][left] = num++;
            }
            left++;
        }
        return res;
    }
}

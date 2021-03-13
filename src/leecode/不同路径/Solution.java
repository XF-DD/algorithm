package leecode.不同路径;

/**
 * @Description https://leetcode-cn.com/problems/unique-paths/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-13 17:07:23
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] record = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                record[i][j] = i==0||j==0 ? 1 : record[i-1][j]+record[i][j-1];
            }
        }
        return record[m-1][n-1];
    }
}

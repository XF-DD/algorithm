package 最小路径和;

/**
 * 动态规划，每个位置记录到达当前位最小值
 * @Author: XF-DD
 * @Date: 21/02/18 17:03
 */
public class SolutionBetter {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(i == 0 && j == 0){
                    continue;
                }

                if(i == 0){
                    grid[i][j] = grid[i][j-1] + grid[i][j];
                    continue;
                }

                if(j == 0){
                    grid[i][j] = grid[i-1][j] + grid[i][j];
                    continue;
                }
                grid[i][j] = grid[i][j] + Math.min(grid[i][j-1],grid[i-1][j]);
            }

        }
        return grid[grid.length-1][grid[0].length-1];
    }
}

package leecode.保持城市天际线;

//https://leetcode-cn.com/problems/max-increase-to-keep-city-skyline/
public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        if(grid.length<1||grid[0].length<1)
            return 0;

        int[][] record = new int[grid.length][grid[0].length];
        int result = 0;
        for(int i = 0;i<grid.length;i++){
            int max = grid[i][0];
            for (int j = 1; j < grid[0].length; j++) {
                if(grid[i][j]>max)
                    max = grid[i][j];
            }
            for (int j = 0; j < grid[0].length; j++) {
                record[i][j] = max - grid[i][j];
            }
        }

        for(int i = 0;i<grid[0].length;i++){
            int max = grid[0][i];
            for (int j = 1; j < grid.length; j++) {
                if(grid[j][i]>max)
                    max = grid[j][i];
            }
            for (int j = 0; j < grid[0].length; j++) {
                result += Math.min(max - grid[j][i],record[j][i]) ;
            }
        }
        return result;
    }
}

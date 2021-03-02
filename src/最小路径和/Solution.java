package 最小路径和;

/**
 * https://leetcode-cn.com/problems/minimum-path-sum/
 * 此方法超时
 * @Author: XF-DD
 * @Date: 21/02/18 16:52
 */
public class Solution {

    private int res = Integer.MAX_VALUE;

    public int minPathSum(int[][] grid) {
        dfs(0,0,grid,0);
        return res;
    }

    private void dfs(int x,int y,int[][] grid,int sum){
        sum += grid[x][y];

        if(sum >= res){
            return;
        }

        if(x == grid.length-1 && y == grid[0].length-1){
            res = sum;
            return;
        }

        if(x < grid.length-1){
            dfs(x+1,y,grid,sum);
        }

        if(y < grid[0].length-1){
            dfs(x,y+1,grid,sum);
        }
    }

}

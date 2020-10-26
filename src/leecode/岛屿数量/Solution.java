package leecode.岛屿数量;

//https://leetcode-cn.com/problems/number-of-islands/
public class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length<1)
            return 0;
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j =0;j<grid[0].length;j++)
                if(grid[i][j] == '1'){
                    HS(grid,i,j);
                    result++;
                }

        }
        return result;
    }

    public boolean HS(char[][] grid,int i,int j){
        if(i<0 || i>grid.length || j<0 || j>grid[0].length)
            return false;
        if(grid[i][j] == '1'){
            grid[i][j] = 'x';
            HS(grid,i+1,j);
            HS(grid,i-1,j);
            HS(grid,i,j+1);
            HS(grid,i,j-1);
            return true;
        }
        return false;
    }
}

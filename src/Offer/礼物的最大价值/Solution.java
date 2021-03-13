package Offer.礼物的最大价值;

/**
 * @Description https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-13 15:59:04
 */
public class Solution {

    int res = 0;

    public int maxValue(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if(i == 0 && j== 0){
                    continue;
                }

                if(i == 0){
                    grid[i][j] += grid[i][j-1];
                    continue;
                }

                if(j == 0){
                    grid[i][j] += grid[i-1][j];
                    continue;
                }
                grid[i][j] += Math.max(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[grid.length-1][grid[0].length-1];

    }



}

package Offer.礼物的最大值;

/**
 * @Author: XF-DD
 * @Date: 20/06/02 14:16
 */
public class Solution {
    public int maxValue(int[][] grid) {
        int[][] record = new int[grid.length][grid[0].length];
        int indexI,indexJ;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                indexI = i==0?0:i-1;
                indexJ = j==0?0:j-1;
                record[i][j] = Math.max(record[indexI][j],record[i][indexJ]) + grid[i][j];
            }
        }
        return record[grid.length-1][grid[0].length-1];
    }
}

package Offer.机器人的运动范围;

/**
 * @Author: XF-DD
 * @Date: 20/06/02 14:30
 */
public class Solution {
    private boolean[][] record;
    private int m,n,k;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.record = new boolean[m][n];
        return dfs(0,0,0,0);
    }

    private int dfs(int x, int y, int sumX, int sumY){
        if( x>=m || y>=n || k < sumX+sumY || record[x][y]){
            return 0;
        }
        this.record[x][y] = true;
        return 1+dfs(x+1,y,(x+1)%10==0?sumX-8:sumX+1,sumY)+dfs(x,y+1,sumX,(y+1)%10==0?sumY-8:sumY+1);
    }
}

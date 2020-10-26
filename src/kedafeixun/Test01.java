package kedafeixun;

import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/29 19:03
 */
public class Test01 {

    private static int res = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] split = s.split(",");
        int m =  Integer.parseInt(split[0]);
        int n = Integer.parseInt(split[1]);

        int[][] record = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                record[i][j] = in.nextInt();
            }
            in.nextLine();
        }
        count(record,0,0,0,m,n);
        System.out.println(res);

    }

    private static void count(int[][] record, int x, int y,int now, int m, int n) {
        if(x<0 || y<0 || x>=m || y>= n){
            return;
        }
        now += record[x][y];
        if(x == m-1&&y==n-1){
            res = Math.max(res,now);
        }
        count(record,x+1,y,now,m,n);
        count(record,x,y+1,now,m,n);
    }
}

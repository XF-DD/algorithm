package duxiaoman;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/09/20 20:28
 */
public class Test02 {
    private static boolean[][] record;
    private static boolean flag = false;
    private static int res = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nextInt = in.nextInt();
        in.nextLine();
        for (int i = 0; i < nextInt; i++) {
            String mnStr = in.nextLine();
            String[] mn = mnStr.split(" ");
            int n = Integer.parseInt(mn[0]);
            int m = Integer.parseInt(mn[1]);
            char[][] data = new char[n][m];
            int x = -1, y=-1;
            for (int j = 0; j < n; j++) {
                String s = in.nextLine();
                for (int k = 0; k < m; k++) {
                    data[j][k] = s.charAt(k);
                    if(data[j][k] == '@'){
                        x = j;
                        y = k;
                    }
                }
            }
            record = new boolean[n][m];
            flag = false;
            res = Integer.MAX_VALUE;
            deal(data,x,y,n,m,0);
            if(!flag){
                System.out.println(-1);
            }else {
                System.out.println(res);
            }
        }
    }

    // x是纵，y是横 为@起始位置,record:走过为true
    private static void deal(char[][] data, int x, int y,int n,int m,int now) {
        if(x == -1 || x == n || y == -1 || y == m){
            flag = true;
            if(now < res){
                res = now;
            }
            return;
        }
        if(record[x][y] || data[x][y] == '#' || now >= res){
            return ;
        }

        record[x][y] = true;

        if(data[x][y] == '*'){
            now++;
        }
        deal(data,x-1,y,n,m,now);
        deal(data,x+1,y,n,m,now);
        deal(data,x,y-1,n,m,now);
        deal(data,x,y+1,n,m,now);

        record[x][y] = false;
    }
}

package JD;



import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/27 20:18
 */
public class Test02 {

    public static int res = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            s = s.trim();
            strList.add(s);
        }
        int[][] record = new int[n][n * 2 - 1];
        for (int i = 0; i < n; i++) {
            String s = strList.get(i);
            String[] ss = s.split(" ");
            int index = n - i -1;
            for (String value : ss) {
                record[i][index] = Integer.parseInt(value);
                index++;
            }
        }
        int y = n -1;
        count(0,y,0,record,n-1);
        System.out.println(res);
    }

    // n-1
    public static void count(int x, int y ,int now,int[][] record,int n){
        now = now + record[x][y];
        if(x == n){
            if(now>res){
                res = now;
            }
            return;
        }
        if(record[x+1][y+1] != 0){
            count(x+1,y+1,now,record,n);
        }

        if(record[x+1][y-1] != 0){
            count(x+1,y-1,now,record,n);
        }

        if(record[x+1][y] != 0){
            count(x+1,y,now,record,n);
        }
    }
}

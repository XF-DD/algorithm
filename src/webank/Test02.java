package webank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/09/27 20:02
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int shun = in.nextInt();
        int fan = in.nextInt();
        int ni = in.nextInt();
        in.nextLine();

        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();

        int times = in.nextInt();
        in.nextLine();

        for (int i = 0; i < times; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int[] data = {x, y, n, m};
            for (int j = 0; j < shun; j++) {
                data = shun(data);
            }
            for (int j = 0; j < fan; j++) {
                data = fan(data);
            }
            for (int j = 0; j < ni; j++) {
                data = ni(data);
            }
            System.out.println(data[0] + " " + data[1]);
            in.nextLine();
        }

    }

    // x,y,n(竖),m(横)
    public static int[] shun(int[] data){
        int x = data[0];
        int y = data[1];
        int n = data[2];
        int m = data[3];

        int newX = y;
        int newY = n + 1 - x;
        int newN = m;
        int newM = n;
        return new int[]{newX,newY,newN,newM};
    }

    // x,y,n(竖),m(横)
    public static int[] fan(int[] data){
        int x = data[0];
        int y = data[1];
        int n = data[2];
        int m = data[3];

        int newX = x;
        int newY = m + 1 - y;
        int newN = n;
        int newM = m;
        return new int[]{newX,newY,newN,newM};
    }

    // x,y,n(竖),m(横)
    public static int[] ni(int[] data){
        int x = data[0];
        int y = data[1];
        int n = data[2];
        int m = data[3];

        int newX = m + 1 - y;
        int newY = x;
        int newN = m;
        int newM = n;
        return new int[]{newX,newY,newN,newM};
    }
}

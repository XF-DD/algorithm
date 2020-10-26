package Tencent;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = Integer.parseInt(s);
        for (int i = 0; i < n; i++) {
            Main5.cal(in.nextLine());
        }

    }

    public static void cal(String s){
        String[] snums = s.split(" ");
        int x = Integer.parseInt(snums[0]);
        int k = Integer.parseInt(snums[1]);
        if(x<1){
            System.out.println(-1);
            return;
        }

        if(k<1){
            System.out.println(-1);
            return;
        }


        int index = 1;
        int xk = 0;
        while (x>=index){
            xk++;
            index*=2;
        }
        if(k>=xk)
            System.out.println(-1);
        else {
            while (xk>k){
                x = x/2;
                xk--;
            }
            System.out.println(x);
        }


    }
}

package didi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/09/13 19:56
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = Integer.parseInt(in.nextLine());
        ArrayList<Boolean> resList = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            String[] s = in.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);

            boolean[][] data = new boolean[n + 1][n + 1];
            for (int j = 0; j < m; j++) {
                String[] strings = in.nextLine().split(" ");
                int x = Integer.parseInt(strings[0]);
                int y = Integer.parseInt(strings[1]);
                int mon = Integer.parseInt(strings[2]);
                if(mon <= k){
                    data[x][y] = true;
                    data[y][x] = true;
                }
            }
            resList.add(deal(data));
        }
        for (Boolean item : resList) {
            String s = item ? "Yes":"No";
            System.out.println(s);
        }
    }

    private static boolean deal(boolean[][] data){
        for (int i = 1; i < data.length; i++) {
            if(deal(data,new HashSet<>(),i)){
                return true;
            }
        }
        return false;
    }

    private static boolean deal(boolean[][] data, HashSet<Integer> set,int index){
        for (int i = 1; i < data.length; i++) {
            if(!set.contains(i) && data[index][i]){
                set.add(i);
                if(set.size() == data.length-1){
                    return true;
                }
                if(deal(data,set,i)){
                    return true;
                }
                set.remove(i);
            }
        }
        return false;
    }
}

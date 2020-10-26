package Meituan;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/22 17:36
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int k = in.nextInt();
        int[] level = new int[size+1];
        in.nextLine();
        boolean[][] record = new boolean[size+1][size+1];
        for (int i = 0; i < size; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            in.nextLine();
            record[x][y] = true;
        }
        for (int i = 1; i <= size; i++) {
            level[i] = in.nextInt();
        }

    }

    public static void check(HashSet<HashSet<Integer>> set){
        /**
         * 思路：
         * 1. 回溯递归调用，每进入一次 ，判断set是否已存在该数，在则跳过
         * 2. 判断该数是否超过登记限制，没有则+1，并继续递归调用
         */
    }


}

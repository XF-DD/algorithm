package growingio;

import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/09/12 15:36
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] strs = s.split(" ");
        if(strs.length<1){
            System.out.println(0);
            return;
        }
        int[] data = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            data[i] = Integer.parseInt(strs[i]);
        }
        // 动态规划，记录最大长度
        int[] record = new int[data.length];
        int max = 1 ;
        record[0] = 1;

        for (int i = 1; i < data.length; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                if(data[i]>data[j] && record[j]>temp){
                    temp = record[j];
                }
            }
            temp++;
            record[i] = temp;
            if(temp > max){
                max = temp;
            }
        }
        System.out.println(max);
    }
}

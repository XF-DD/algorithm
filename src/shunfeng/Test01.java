package shunfeng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/29 14:55
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int[] record = new int[n];
            for (int i = 0; i < n; i++) {
                record[i] = in.nextInt();
            }
            int count = count(record);
            System.out.println(count);
        }
    }

    private static int count(int[] record) {
        int pre;
        int cha = -1;
        int res = 1;
        int num = 0;
        if(record.length == 0){
            return 0;
        }else if(record.length <= 2){
            System.out.println(1);
            return 1;
        }
        pre = record[0];
        for (int i = 1; i < record.length; i++) {
            if(record[i] == -1){
                num++;
                continue;
            }
            if(pre == -1){
                pre = record[i];
                num = 0;
                continue;
            }
            int newCha = record[i] - pre;
            if(num == 0){
                if(cha == -1 || cha == newCha){
                    pre = record[i];
                    cha = newCha;
                }else {
                    res++;
                    pre = record[i];
                    cha = -1;
                }
            }else {
                if(newCha%(num+1)!=0){
                    res++;
                    pre = record[i];
                    cha = -1;
                    num = 0;
                }else {
                    int sCha = newCha/(num+1);
                    if(cha == -1 || cha == sCha){
                        pre = record[i];
                        cha = sCha;
                        num = 0;
                    }else {
                        pre = record[i];
                        res++;
                        cha = -1;
                        num = 0;
                    }
                }
            }
        }
        return res;
    }
}

package shunfeng;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/29 15:39
 */
public class Test02 {
    public static int resMoney = 0;
    public static int resSize = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        int[] record = new int[n];
        for (int i = 0; i < n; i++) {
            record[i] = in.nextInt();
        }
        count(0,0,0,record,1,k);
        System.out.println(resMoney);
        System.out.println(resSize);
    }

    // 到了那里，现在一共多少价值，目前最多数量的货物，现在第几趟
    private static void count(int index,int nowMoney,int nowMaxSize,int[] record,int nowK,int k){
        if(nowK == k){
            int sum = 0;
            int num = 0;
            for (int i = index; i < record.length; i++) {
                sum += record[i];
                num++;
            }
            int money = sum*sum + nowMoney;
            int size = Math.max(num,nowMaxSize);


            if(money>resMoney){
                resSize = size;
                resMoney = money;
            }else if(money == resMoney){
                resSize = Math.min(resSize,size);
            }
        }else {
            int sum = 0;
            int num = 0;
            // 到了那里，现在一共多少价值，目前最多数量的货物，现在第几趟
            for (int i = index; i < record.length-(k-nowK); i++) {
                sum += record[i];
                num++;
                int money = sum*sum + nowMoney;
                int size = Math.max(num,nowMaxSize);
                count(i+1,money,size,record,nowK+1,k);
            }
        }
    }
}

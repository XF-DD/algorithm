package JD;

import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/27 19:32
 * If a file descriptor being monitored by select() is closed in another thread, the result is unspecified
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            in.nextLine();
            if(num <1){
                System.out.println("无效输入");
                continue;
            }
            int n = 0;
            int start = 0;
            int record = 0;
            for (int i = 1;start < num; i++){
                n++;
                record = start;
                start += Math.pow(3d,i);
            }
            int cha = num - record;

            StringBuilder builder = new StringBuilder("");
            StringBuilder count = count(n, cha, builder);
            System.out.println(count.toString());

        }
    }

    public static StringBuilder count(int n,int cha,StringBuilder builder){
        // 一行有多少个
        int a = (int)Math.pow(3,n-1);
        int index = (cha-1) / a;
        if(index == 0){
            builder.append(2);
        }else if(index == 1){
            builder.append(3);
        }else {
            builder.append(5);
        }
        n = n-1;
        if(n == 0){
            return builder;
        }
        int newCha = cha%a;
        if(cha!=0 && newCha == 0){
            newCha = a;
        }
        return count(n,newCha,builder);
    }
}

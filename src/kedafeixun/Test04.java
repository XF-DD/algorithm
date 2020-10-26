package kedafeixun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/29 19:51
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l = in.nextLong();
        ArrayList<String> list = new ArrayList<>();
        count(l,list);
        StringBuilder stringBuilder = new StringBuilder("");
        list.forEach(item ->{
            stringBuilder.append(item).append("*");
        });
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        System.out.println(stringBuilder.toString());
    }

    public static void count(long n, List<String> list){
        double sqrt = Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if(n%i == 0){
                list.add(String.valueOf(i));
                count(n/i,list);
                return;
            }
        }
        list.add(String.valueOf(n));
    }
}

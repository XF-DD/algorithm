package kedafeixun;

import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/29 20:29
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        String[] split = s.split(",");
        int[] record = new int[n];
        for (int i = 0; i < n; i++) {
            record[i] = Integer.parseInt(split[i]);
        }

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if(record[j] < record[min]){
                    min = j;
                }
            }
            int temp = record[i];
            record[i] = record[min];
            record[min] = temp;
        }

        StringBuilder builder = new StringBuilder("");
        for (int i : record) {
            builder.append(i).append(",");
        }
        builder.deleteCharAt(builder.length()-1);
        System.out.println(builder.toString());
    }
}

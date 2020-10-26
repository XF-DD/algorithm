package didi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/09/13 19:01
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String s = in.nextLine();

        StringBuilder resBuilder = new StringBuilder();
        int left = 0;
        while (s.length() - left > 0){
            if(s.length()- left < n){
                resBuilder.append(deal(s.substring(left)));
            }else {
                resBuilder.append(deal(s.substring(left,left+n)));
            }
            left += n;
        }
        System.out.println(resBuilder.toString());
    }

    public static String deal(String s){
        char[] data = new char[s.length()];
        int left = 0;
        int right = s.length()-1;
        while (left<=right){
            data[left] = s.charAt(right);
            data[right] = s.charAt(left);
            left++;
            right--;
        }
        return new String(data);
    }
}

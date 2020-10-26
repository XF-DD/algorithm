package Meituan;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @Author: XF-DD
 * @Date: 20/08/22 16:05
 */
public class Test1 {
    public static boolean HasDigit(String s){
        Pattern compile = Pattern.compile(".*\\d+.*");
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = Integer.parseInt(in.nextLine());
        for (int j = 0; j < i; j++) {
            String s = in.nextLine();
            char[] chars = s.toCharArray();
            boolean firstIsStr = false;
            boolean hasNum = false;
            boolean hasOther = true;

            if(chars.length < 2){
                System.out.println("Wrong");
                continue;
            }

            if((chars[0] >= 'A' && chars[0] <= 'Z') || (chars[0] >= 'a' && chars[0] <= 'z')){
                firstIsStr = true;
            }

            for (int k = 1; k < chars.length; k++) {
                if(chars[k] >= '0' && chars[k] <= '9'){
                    hasNum = true;
                }else if((chars[k] >= 'A' && chars[k] <= 'Z') || (chars[k] >= 'a' && chars[k] <= 'z')){
                    continue;
                }else {
                    hasOther = false;
                    break;
                }

            }
            if(firstIsStr && hasNum && hasOther){
                System.out.println("Accept");
            }else {
                System.out.println("Wrong");
            }
        }
    }
}

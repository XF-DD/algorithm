package duxiaoman;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/09/20 19:57
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String has = in.nextLine();
        String need = in.nextLine();

        HashMap<Character, Integer> hasMap = new HashMap<>();

        for (int i = 0; i < has.length(); i++) {
            hasMap.put(has.charAt(i),hasMap.getOrDefault(has.charAt(i),0)+1);
        }

        int res = 0;

        for (int i = 0; i < need.length(); i++) {
            char c = need.charAt(i);
            Integer integer = hasMap.getOrDefault(c, 0);
            if(integer>0){
                res++;
                hasMap.put(c,integer-1);
            }
        }
        System.out.println(res);
    }
}

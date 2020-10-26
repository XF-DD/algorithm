package kedafeixun;

import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/08/29 19:33
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
         s = s.replaceAll("_", " ");
         s = s.trim();
         while (s.contains("  ")){
            s = s.replaceAll(" {2}"," ");
         }
         s = s.replaceAll(" ","_");
        System.out.println(s);
    }
}

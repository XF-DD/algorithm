package test01;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: XF-DD
 * @Date: 20/08/08 12:13
 */
public class TsetNextIn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
/*        int i = in.nextInt();
        int i2 = in.nextInt();*/

/*        String next = in.next(); // next : 空格结束
        String next2 = in.next();
        String next3 = in.next();
        in.nextLine();// next line:回车结束
        String s2 = in.nextLine(); */
/*        System.out.println(next);
        System.out.println(next2);
        System.out.println(next3);
        System.out.println(s2);*/

        String s = in.nextLine();
        int i2 = in.nextInt();
        System.out.println(in.nextLine());
        System.out.println(s);
        System.out.println(i2);
        if(in.hasNext()){
            System.out.println(in.next());
        }else {
            System.out.println(-1);
        }
/*        System.out.println(i);
        System.out.println(i2);*/


    }

    void ans(){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Set<Integer> setA = new TreeSet<Integer>();
            for(int i = 0; i<a; i++){
                setA.add(sc.nextInt());
            }
            for(int j = 0; j<b; j++){
                setA.add(sc.nextInt());
            }
            for(Integer i:setA){
                System.out.print(i+" ");
            }
        }
    }
}

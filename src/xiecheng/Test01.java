package xiecheng;

import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/10/13 10:02
 */
public class Test01 {
    /*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static int buyCoke(int m, int a, int b, int c, int x) {
        int res = 0;
        // 差价
        int temp = x;

        while (m>0 && c>0){
            c--;
            res++;
            temp -= 100;
            // 还不够
            if(temp>0){
                continue;
            }
            // 够了，计算多出来的币
            m--;
            temp = Math.abs(temp);
            if(temp>=50){
                b++;
                a += (temp-50)/10;
            }else {
                a += temp/10;
            }
            temp = x;
        }

        if(m == 0){
            return res;
        }

        // 用50买
        while (m>0 && b>0){
            b--;
            res++;
            temp -= 50;
            // 还不够
            if(temp>0){
                continue;
            }
            // 够了，计算多出来的币
            m--;
            temp = Math.abs(temp);
            a += temp/10;
            temp = x;
        }

        if(m == 0){
            return res;
        }

        // 用10买
        while (m>0 && a>0){
            a--;
            res++;
            temp -= 10;
            // 还不够
            if(temp>0){
                continue;
            }
            // 够了，计算多出来的币
            m--;
            temp = x;
        }

        return res;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _a;
        _a = Integer.parseInt(in.nextLine().trim());

        int _b;
        _b = Integer.parseInt(in.nextLine().trim());

        int _c;
        _c = Integer.parseInt(in.nextLine().trim());

        int _x;
        _x = Integer.parseInt(in.nextLine().trim());

        res = buyCoke(_m, _a, _b, _c, _x);
        System.out.println(String.valueOf(res));

    }
}

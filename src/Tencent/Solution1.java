package Tencent;

import java.util.Scanner;
import java.util.Stack;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Stack<String> in = new Stack<>();
        Stack<String> out = new Stack<>();

        String n = scanner.nextLine();
        int num = Integer.parseInt(n);
        for (int i = 0; i < num; i++) {
            String str = scanner.nextLine();
            if(str.charAt(0) == 'a'){
                str = str.substring(4);
                in.push(str);
            }
            else {
                if(out.empty()){
                    while (!in.empty()){
                        out.push(in.pop());
                    }
                }
                if(out.empty())
                    throw new Exception("队列里没有数");
                if(str.equals("peek")){
                    System.out.println(out.peek());
                }else {
                    out.pop();
                }
            }
        }
    }
}

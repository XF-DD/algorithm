package xiecheng;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/10/13 11:05
 */
public class Test03 {
    /*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static int validateArrayUsages(String[] lines) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String line : lines) {
            // 赋值
            if(line.contains("=")){

            }
            // 定义
            else {
                StringBuilder builder = new StringBuilder();
                int index = 0;
                while (true){
                    char c = line.charAt(index);
                    index++;
                    if(c == '['){
                        break;
                    }
                    builder.append(c);
                }

                StringBuilder num = new StringBuilder();
                while (true){
                    char c = line.charAt(index);
                    index++;
                    if(c == ']'){
                        break;
                    }
                    num.append(c);
                }

                map.put(builder.toString(),Integer.parseInt(num.toString()));
            }
        }
        return 0;
    }

    // []里面的
    static int check(String line,int index,HashMap<String, Integer> map){
        char c = line.charAt(index);

        if(c >= '1' && c<= '9'){
            StringBuilder stringBuilder = new StringBuilder();
            while (true){
                char c1 = line.charAt(index);
                index++;
                if(c1 == ']'){
                    break;
                }
                stringBuilder.append(c1);
                return Integer.parseInt(stringBuilder.toString());
            }
        }else {
            StringBuilder builder = new StringBuilder();
            while (true){
                char ch = line.charAt(index);
                index++;
                if(ch == '['){
                    break;
                }
                builder.append(ch);
            }

            Integer integer = map.get(builder.toString());
            int check = check(line, index, map);
            if(check>=integer || check == -1){
                return -1;
            }
            return check;
        }
        return 0;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _lines_size = 0;
        _lines_size = Integer.parseInt(in.nextLine().trim());
        String[] _lines = new String[_lines_size];
        String _lines_item;
        for(int _lines_i = 0; _lines_i < _lines_size; _lines_i++) {
            try {
                _lines_item = in.nextLine();
            } catch (Exception e) {
                _lines_item = null;
            }
            _lines[_lines_i] = _lines_item;
        }

        res = validateArrayUsages(_lines);
        System.out.println(String.valueOf(res));

    }
}

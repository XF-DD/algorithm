package leecode.Z字形变换;

import java.util.ArrayList;

/**
 * @Author: XF-DD
 * @Date: 20/06/02 15:01
 */
public class Solution {
    public String convert(String s, int numRows) {
        if(numRows<2){
            return s;
        }

        ArrayList<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }

        int flag = -1;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            list.get(index).append(s.charAt(i));
            if(index == 0 || index == numRows-1){
                flag = -flag;
            }
            index += flag;
        }
        for (int i = 1; i < numRows; i++) {
            list.get(0).append(list.get(i));
        }
        return list.get(0).toString();
    }
}

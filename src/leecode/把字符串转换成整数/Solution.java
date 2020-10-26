package leecode.把字符串转换成整数;

/**
 * @Author: XF-DD
 * @Date: 20/05/13 11:24
 */
public class Solution {
    public int strToInt(String str) {
        char[] chars = str.trim().toCharArray();
        if(chars.length < 1){
            return 0;
        }
        int sign = 1, startIndex = 1;
        long result = 0;
        if(chars[0] == '-'){
            sign = -1;
        }else if(chars[0] != '+'){
            startIndex = 0;
        }

        for (int i = startIndex; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9'){
                break;
            }
            result = result*10 + (chars[i]-'0');
            if(result>Integer.MAX_VALUE){
                return sign == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
        }
        return (int)result * sign;
    }
}

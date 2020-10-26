package leecode.字符串解码;

/**
 * @Author: XF-DD
 * @Date: 20/05/28 11:23
 */
public class Solution {
    public String decodeString(String s) {
        return dfs(s, 0)[0];
    }
    private String[] dfs(String s, int i) {
        StringBuilder res = new StringBuilder();
        int multi = 0;
        while(i < s.length()) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                multi = multi * 10 + Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i) == '[') {
                String[] tmp = dfs(s, i + 1);
                i = Integer.parseInt(tmp[0]);
                while(multi > 0) {
                    res.append(tmp[1]);
                    multi--;
                }
            }
            else if(s.charAt(i) == ']'){
                return new String[] { String.valueOf(i), res.toString() };
            }

            else{
                res.append(s.charAt(i));
            }
            i++;
        }
        return new String[] { res.toString() };
    }

}

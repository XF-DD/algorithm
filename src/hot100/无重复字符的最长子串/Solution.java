package hot100.无重复字符的最长子串;

import java.util.HashMap;

/**
 * @Author: XF-DD
 * @Date: 20/09/12 16:46
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                left = Math.max(left,map.get(c) + 1);
            }
            map.put(c,i);
            max = Math.max(max,i - left+1);
        }
        return max;
    }
}

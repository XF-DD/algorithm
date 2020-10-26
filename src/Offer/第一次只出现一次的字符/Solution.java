package Offer.第一次只出现一次的字符;

import java.util.HashMap;

/**
 * @Author: XF-DD
 * @Date: 20/06/17 17:02
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 */
public class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character, Boolean> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(map.containsKey(c)){
                map.put(c,false);
            }else {
                map.put(c,true);
            }
        }
        for (char c : chars) {
            if(map.get(c)){
                return c;
            }
        }
        return ' ';
    }
}

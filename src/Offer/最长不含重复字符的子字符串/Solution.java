package Offer.最长不含重复字符的子字符串;

import java.util.HashMap;

//https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, index = -1;
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
                index = Math.max(index,map.get(s.charAt(i)));
            max = Math.max(max,i-index);
            map.put(s.charAt(i),i);
        }
        return max;
    }
}

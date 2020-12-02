package Offer.最长不含重复字符的子字符串;

import java.util.HashMap;

/**
 * @Description https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-26 16:15:56
 */
public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){

            }
        }
        return 0;
    }
}

package hot100.单词拆分;

import java.util.HashSet;
import java.util.List;

/**
 * @Description https://leetcode-cn.com/problems/word-break/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-13 16:13:39
 */
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        int max = 0;
        HashSet<String> set = new HashSet<>();
        for (String item : wordDict) {
            set.add(item);
            max = Math.max(max,item.length());
        }

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 0; i < s.length() + 1; i++) {
            int index = Math.max(0, i - max);
            for (;index<i;index++){
                if(dp[index] && set.contains(s.substring(index,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}

package leecode.最长连续序列;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author: XF-DD
 * @Date: 20/06/06 14:20
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }
        int res = 0;
        for (int i : nums) {
            if(!set.contains(i)){
                continue;
            }
            int max = 1;
            int temp = i;
            set.remove(temp);

            while (set.contains(temp-1)){
                temp--;
                max++;
                set.remove(temp);
            }

            temp = i;
            while (set.contains(temp+1)){
                temp++;
                max++;
                set.remove(temp++);
            }
            if(max>res){res = max;}
        }
        return res;
    }
}

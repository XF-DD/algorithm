package leecode.缺失的第一个正数;

import java.util.HashSet;

/**
 * @Author: XF-DD
 * @Date: 20/06/27 11:04
 */
public class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int min = 0;
        for (int i : nums) {
            set.add(i);
            if(i == min+1){
                min += 1;
                while (set.contains(min+1)){
                    min += 1;
                }
            }
        }
        return min+1;
    }
}

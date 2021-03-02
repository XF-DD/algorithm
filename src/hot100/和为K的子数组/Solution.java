package hot100.和为K的子数组;

import java.util.HashMap;

/**
 * @Description https://leetcode-cn.com/problems/subarray-sum-equals-k/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-01-11 19:16:17
 */
public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0,1);

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

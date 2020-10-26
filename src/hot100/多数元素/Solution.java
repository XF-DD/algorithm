package hot100.多数元素;

import java.util.HashMap;

/**
 * @Author: XF-DD
 * @Date: 20/09/12 17:00
 */
public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if(nums.length<1){
            return -1;
        }
        int res = nums[0];
        map.put(nums[0],1);
        for (int i = 1; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int temp = map.get(nums[i]) + 1;
                if(temp>map.get(res)){
                    res = nums[i];
                }
                map.put(nums[i],temp);
            }else {
                map.put(nums[i],1);
            }
        }
        return res;
    }
}

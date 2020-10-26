package leecode.两数之和;

import java.util.Arrays;
import java.util.HashMap;

//https://leetcode-cn.com/problems/two-sum/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff))
                return new int[]{map.get(diff),i};
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(5,5);

        boolean b = map.containsKey(2);
        System.out.println(b);

    }
}

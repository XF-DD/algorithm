package leecode.递增子序列;

import java.util.*;

//https://leetcode-cn.com/problems/increasing-subsequences/submissions/
public class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        ArrayList<List<Integer>> arrayLists = new ArrayList<>();
        addData(arrayLists, new Stack<>(), 0,nums);
        return arrayLists;
    }

    public void addData(ArrayList<List<Integer>> result, Stack<Integer> stack, int index,int[] nums){
        if (stack.size()>1 && stack.size() <= nums.length )
            result.add(new ArrayList<>(stack));
        HashSet<Integer> set = new HashSet<>();
        for (int i = index; i < nums.length; i++) {
            if(set.contains(nums[i])) continue;
            if(stack.size()>0 && nums[i] < stack.peek()) continue;
            set.add(nums[i]);
            stack.push(nums[i]);
            addData(result,stack,i+1,nums);
            stack.pop();
        }
    }



    public static void main(String[] args) {
        new HashMap<>();
        new HashSet<>();
    }
}

package leecode.全排列;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/permutations/
public class Solution {
    int temp;
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        comeOn(0,nums,result);
        return result;
    }

    public void comeOn(int index,int[] nums, ArrayList<List<Integer>> result){
        if(index == nums.length-1){
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
        }
        else {
            for (int i = index; i < nums.length; i++) {
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                comeOn(index+1,nums,result);
                temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
    }
}

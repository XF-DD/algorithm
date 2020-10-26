package hot100.组合总和;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/06/27 11:32
 */
public class Solution {
    private List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates,target,0,0,new ArrayDeque<>());
        return result;
    }

    private void dfs(int[] candidates, int target, int sum , int index, ArrayDeque<Integer> deque){
        if(sum == target){
            result.add(new ArrayList<>(deque));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if(candidates[i] + sum > target){break;}
            deque.addLast(candidates[i]);
            dfs(candidates,target,sum+candidates[i],i,deque);

            deque.removeLast();
        }
    }
}

package hot100.路径总和111;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/08/16 10:50
 */
public class Solution2 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root,sum,new LinkedList<>());
        return res;
    }

    private void dfs(TreeNode root, int sum, LinkedList<Integer> list){
        if(root == null){
            return;
        }
        list.addLast(root.val);

        if(root.left == null && root.right == null && root.val == sum){
            ArrayList<Integer> vo = new ArrayList<>(list);
            res.add(vo);
        }else {
            dfs(root.left,sum-root.val,list);
            dfs(root.right,sum-root.val,list);
        }

        list.removeLast();
    }
}

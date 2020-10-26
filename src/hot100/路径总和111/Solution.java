package hot100.路径总和111;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/08/16 10:42
 */
public class Solution {
    int res = 0;
    public int pathSum(TreeNode root, int sum) {
        if(root == null){
            return res;
        }
        dfs(root,sum,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return res;
    }

    private void dfs(TreeNode root, int nowSum, int oldSum){
        if(root == null){
            return;
        }
        if(root.val == nowSum){
            res++;
        }
        dfs(root.left,nowSum-root.val,oldSum);
        dfs(root.right,nowSum-root.val,oldSum);
    }

}

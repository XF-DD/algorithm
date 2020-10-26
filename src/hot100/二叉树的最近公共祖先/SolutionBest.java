package hot100.二叉树的最近公共祖先;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/08/08 11:49
 */
public class SolutionBest {
    private TreeNode ans;

    public SolutionBest(){
        ans = null;
    }

    private boolean dfs( TreeNode root, TreeNode p , TreeNode q ){
        if(root == null) {return false;}

        boolean flag = root.val == p.val || root.val == q.val;

        boolean lson = dfs(root.left, p, q);
        boolean rson = dfs(root.right, p, q);

        if(  (lson && rson) || (flag && (lson || rson) ) ){
            ans = root;
        }

        return lson || rson || flag;
    }
}

package leecode.另一个树的子树;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 23:00
 */
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        boolean flag = false;
        if(s == null || t == null){
            return false;
        }
        if(s.val == t.val){
            flag = check(s,t);
        }
        return flag || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean check(TreeNode root , TreeNode s){
        if(root == null && s == null){
            return true;
        }
        if(root == null || s == null){
            return false;
        }
        return root.val == s.val && check(root.left,s.left) && check(root.right,s.right);
    }
}

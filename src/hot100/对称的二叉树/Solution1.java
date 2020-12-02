package hot100.对称的二叉树;

import Util.TreeNode;

/**
 * @Description https://leetcode-cn.com/problems/symmetric-tree/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-12-02 10:04:47
 */
public class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode left,TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }

        if(left.val != right.val){
            return false;
        }

        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }


}

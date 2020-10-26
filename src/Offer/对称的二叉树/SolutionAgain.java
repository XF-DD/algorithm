package Offer.对称的二叉树;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 23:14
 */
public class SolutionAgain {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {

        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }

        return left.val == right.val && isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }
}

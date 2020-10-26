package leecode.对称二叉树;

//https://leetcode-cn.com/problems/symmetric-tree/
public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return false;
        return check(root.left,root.right);
    }

    public boolean check(TreeNode left , TreeNode right){
        if(null == left && null == right)
            return true;
        if(left == null || right == null)
            return false;

        return left.val == right.val&&check(left.left,right.right) &&check(left.right,right.left);

    }

}

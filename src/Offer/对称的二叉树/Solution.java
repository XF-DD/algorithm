package Offer.对称的二叉树;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/05/12 13:31
 * https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        return check(root.left,root.right);
    }

    public boolean check(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }else if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }

        return check(left.left,right.right) && check(left.right,right.left);
    }
}

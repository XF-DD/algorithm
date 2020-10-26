package Offer.简单二叉树;

import Util.TreeNode;

/**
 * @author DD
 */
//https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int left = check(root.left,0);
        int right = check(root.right,0);
        if(left-right>1||right-left>1){
            return false;
        }else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int check(TreeNode node , int max){
        if(node == null){
            return max;
        }
        max++;
        return Math.max(check(node.left,max),check(node.right,max));
    }

}

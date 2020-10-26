package Offer.平衡二叉树;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 22:31
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        int record = record(root);
        return record != -1;
    }

    public int record(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = record(root.left);
        int right = record(root.right);
        if(left == -1 || right == -1){
            return -1;
        }

        int abs = Math.abs(left - right);
        if(abs >= 2){
            return -1;
        }
        return Math.max(left,right)+1;
    }
}

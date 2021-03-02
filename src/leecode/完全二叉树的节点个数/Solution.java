package leecode.完全二叉树的节点个数;

import Util.TreeNode;

/**
 * @Description https://leetcode-cn.com/problems/count-complete-tree-nodes/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-24 15:33:35
 */
public class Solution {
    private static int sum;
    public int countNodes(TreeNode root) {
        sum = 0;
        count(root);
        return sum;
    }

    private void count(TreeNode root){
        if(root==null){
            return;
        }
        sum++;
        count(root.left);
        count(root.right);
    }
}

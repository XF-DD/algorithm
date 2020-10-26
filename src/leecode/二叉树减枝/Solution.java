package leecode.二叉树减枝;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 22:55
 */
public class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.val == 0 && root.left == null && root.right == null){
            return null;
        }
        return root;
    }
}

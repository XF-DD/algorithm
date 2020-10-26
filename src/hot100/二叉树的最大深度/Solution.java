package hot100.二叉树的最大深度;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/09/12 16:57
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}

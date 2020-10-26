package leecode.二叉树中的最大路径和;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/06/21 10:46
 */
public class Solution {

    private int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return result;
    }

    private int maxGain(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxLeft = Math.max(maxGain(root.left), 0);
        int maxRight = Math.max(maxGain(root.right), 0);
        int maxNow = maxLeft + maxRight + root.val;

        result = Math.max(maxNow,result);

        return Math.max(maxLeft,maxRight)+root.val;
    }


}

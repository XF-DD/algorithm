package hot100.路径总和111;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/08/16 10:46
 * https://leetcode-cn.com/problems/path-sum/
 */
public class Solution1 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null){
            return root.val == sum;
        }

        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}

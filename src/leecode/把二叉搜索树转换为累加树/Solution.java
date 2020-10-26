package leecode.把二叉搜索树转换为累加树;

import Util.TreeNode;

//https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
public class Solution {
    int temp = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root== null)
            return null;
        if(root.right != null)
            convertBST(root.right);
        root.val += temp;
        temp = root.val;
        if(root.left != null)
            convertBST(root.left);
        return root;
    }
}

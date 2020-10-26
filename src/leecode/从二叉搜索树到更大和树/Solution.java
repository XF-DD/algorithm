package leecode.从二叉搜索树到更大和树;

//https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/


import Util.TreeNode;

import java.util.Stack;

public class Solution {
    int temp = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root ==null)
            return null;
        if(root.right != null)
            bstToGst(root.right);
        root.val += temp;
        temp = root.val;
        if(root.left != null)
            bstToGst(root.left);
        return root;
    }

    public static void main(String[] args) {

    }

}

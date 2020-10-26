package leecode.二叉树的前序遍历;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/06/14 12:15
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        front(root,list);
        return list;
    }

    private void front(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        front(root.left, list);
        front(root.right, list);
    }

}

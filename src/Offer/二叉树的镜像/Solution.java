package Offer.二叉树的镜像;

import Util.TreeNode;

import java.util.LinkedList;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 23:10
 */
public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null){
            return null;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode first = queue.pollFirst();
            TreeNode temp = first.left;
            first.left = first.right;
            first.right = temp;
            if(first.left!=null){
                queue.addLast(first.left);
            }
            if(first.right!=null){
                queue.addLast(first.right);
            }
        }
        return root;
    }
}

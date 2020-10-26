package Offer.二叉树的次序遍历;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/09/06 10:05
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        int size = 1;
        int childSize = 0;
        LinkedList<List<Integer>> resList = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.pollFirst();
            list.add(node.val);
            if(node.left!=null){
                queue.addLast(node.left);
                childSize++;
            }
            if(node.right!=null){
                queue.addLast(node.right);
                childSize++;
            }
            size --;

            if(size == 0){
                resList.addFirst(list);
                list = new ArrayList<>();
                size = childSize;
                childSize = 0;
            }
        }
        return resList;
    }
}

package Offer.从上到下打印二叉树II;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/05/11 11:56
 */
public class Solution {
    ArrayList<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        build(root,0);
        return result;
    }

    public void build(TreeNode root , int k ){
        if(root == null) {
            return;
        }
        if(result.size() <= k){
            result.add(new ArrayList<>());
        }
        result.get(k).add(root.val);
        build(root.left,k+1);
        build(root.right,k+1);
    }

    public static void main(String[] args) {
        LinkedList<TreeNode> list = new LinkedList<>();
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        list.add(node);
        list.add(node.left);
        list.add(node.right);

        System.out.println(list.peek());
        list.poll();
        System.out.println(list.peek());
    }
}

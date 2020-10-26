package Offer.二叉搜索树的第k大节点;

import Util.TreeNode;

import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 23:19
 */
public class SolutionAgain {

    public int kthLargest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node!=null){
            while (node!=null){
                stack.push(node);
                node = node.right;
            }

            TreeNode pop = stack.pop();
            k--;
            if(k == 0){
                return pop.val;
            }
            node = pop.right;
        }
        return -1;
    }


}

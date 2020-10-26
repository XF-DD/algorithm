package tree.二叉树的前序遍历;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/06/15 14:17
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            result.add(pop.val);
            if(pop.right != null){
                stack.push(pop.right);
            }

            if(pop.left != null){
                stack.push(pop.left);
            }
        }
        return result;
    }
}

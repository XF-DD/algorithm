package tree.二叉树的后序遍历;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/06/15 14:40
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return list;
        }
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode pop = stack.pop();
            if(pop == null){
                pop = stack.pop();
                list.add(pop.val);
                continue;
            }
            if(pop.left != null || pop.right != null){
                stack.push(pop);
                stack.push(null);

                if(pop.right != null){
                    stack.push(pop.right);
                }

                if(pop.left!=null){
                    stack.push(pop.left);
                }
            }else {
                list.add(pop.val);
            }
        }
        return list;
    }
}

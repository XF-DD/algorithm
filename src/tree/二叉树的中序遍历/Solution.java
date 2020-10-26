package tree.二叉树的中序遍历;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/06/15 14:27
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root){
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        ArrayList<Integer> result = new ArrayList<>();

        while (!stack.isEmpty() || node!=null){
            while (node != null){
                stack.push(node);
                node = node.left;
            }

            if(!stack.isEmpty()){
                node = stack.pop();
                result.add(node.val);
                node = node.right;
            }
        }
        return result;
    }
}

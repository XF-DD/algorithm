package Offer.从上到下打印二叉树;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Stack<TreeNode> oddStack = new Stack<>();
        Stack<TreeNode> evenStack = new Stack<>();
        boolean odd = true;
        oddStack.push(root);
        ArrayList<Integer> list = new ArrayList<>();
        while (!oddStack.empty() || !evenStack.empty()){
            if(odd){
                TreeNode pop = oddStack.pop();
                list.add(pop.val);
                if(pop.left != null) {
                    evenStack.push(pop.left);
                }
                if(pop.right != null) {
                    evenStack.push(pop.right);
                }
                if(oddStack.empty()){
                    result.add(list);
                    list = new ArrayList<>();
                    odd = false;
                }
            }else {
                TreeNode pop = evenStack.pop();
                list.add(pop.val);
                if(pop.right != null) {
                    oddStack.push(pop.right);
                }
                if(pop.left != null) {
                    oddStack.push(pop.left);
                }
                if(evenStack.empty()){
                    result.add(list);
                    list = new ArrayList<>();
                    odd = true;
                }
            }
        }
        return result;
    }
}

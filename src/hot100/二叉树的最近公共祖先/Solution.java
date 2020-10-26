package hot100.二叉树的最近公共祖先;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/08/08 10:43
 */
public class Solution {
     LinkedList<TreeNode> listP = new LinkedList<>();
     LinkedList<TreeNode> listQ = new LinkedList<>();
    boolean flagP = true;
    boolean flagQ = true;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        check(root,p,q);
        if(listP.size() ==0 || listQ.size() == 0){
            return null;
        }
        TreeNode temp = null;
        while (listP.size()>0 && listQ.size()>0&& listP.peek().val == listQ.peek().val){
            temp = listP.removeFirst();
            listQ.removeFirst();
        }
        return temp;
    }

    public void check(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return;
        }
        if(!flagP && !flagQ){
            return;
        }

        if(flagP){
            listP.addLast(root);
            if(root.val == p.val){
                flagP = false;
            }
        }

        if(flagQ){
            listQ.addLast(root);
            if(root.val == q.val){
                flagQ = false;
            }
        }

        check(root.left,p,q);
        check(root.right,p,q);
        if(flagP){
            listP.removeLast();
        }
        if(flagQ){
            listQ.removeLast();
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createTreeNode(new int[]{3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4});
        Solution solution = new Solution();
        TreeNode node = solution.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(1));
        System.out.println(node.val);
    }
}

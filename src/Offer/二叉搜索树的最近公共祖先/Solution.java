package Offer.二叉搜索树的最近公共祖先;

import Util.TreeNode;

import java.util.LinkedList;

/**
 * @Author: XF-DD
 * @Date: 20/05/12 12:49
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-zui-jin-gong-gong-zu-xian-lcof/
 */
public class Solution {
    LinkedList<TreeNode> listP = new LinkedList<>();
    LinkedList<TreeNode> listQ = new LinkedList<>();
    boolean flagP = true;
    boolean flagQ = true;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        check(root,p,q);
        TreeNode result = null;
        while (listQ.size()>0&& listP.size()>0 && listP.peek().val == listQ.peek().val){
            result = listP.poll();
            listQ.poll();
        }
        return result;
    }

    public void check(TreeNode root,TreeNode p,TreeNode q){

        if(root == null){
            return;
        }

        if(flagP){
            //找到p
            if(p.val==root.val){
                flagP = false;
            }
            listP.add(root);
        }
        if(flagQ){
            //找到q
            if(q.val==root.val){
                flagQ = false;
            }
            listQ.add(root);
        }

        check(root.left,p,q);
        check(root.right,p,q);
        if(flagP){
            listP.pollLast();
        }
        if(flagQ){
            listQ.pollLast();
        }
    }
}

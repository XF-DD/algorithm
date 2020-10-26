package Offer.二叉搜索树的最近公共祖先;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/05/12 13:12
 */
public class SolutionBetter {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}

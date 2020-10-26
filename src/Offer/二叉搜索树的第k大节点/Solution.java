package Offer.二叉搜索树的第k大节点;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/06/17 17:16
 */
public class Solution {
    private int num,result;
    public int kthLargest(TreeNode root, int k) {
        this.num = k;
        kthLargest(root);
        return result;
    }

    private void kthLargest(TreeNode root) {
        if(root == null){
            return;
        }
        kthLargest(root.right);
        if(num ==0){
            return;
        }
        num--;
        if(num == 0){
            result = root.val;
        }
        kthLargest(root.left);
    }
}

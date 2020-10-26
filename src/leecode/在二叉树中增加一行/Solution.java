package leecode.在二叉树中增加一行;

import Util.TreeNode;

/**
 * @Author: XF-DD
 * @Date: 20/06/12 11:42
 */
public class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) { ;
        TreeNode head = new TreeNode(v);
        head.left = root;
        addOneRow2(head,v,d-1,0);
        return head.left;
    }

    private void addOneRow2(TreeNode root, int v, int d, int index) {
        if(root == null){
            return;
        }
        if(index == d){
            TreeNode nodeL = new TreeNode(v);
            nodeL.left = root.left;
            root.left = nodeL;

            TreeNode nodeR = new TreeNode(v);
            nodeR.right = root.right;
            root.right = nodeR;
        }else {
            addOneRow2(root.left,v,d,index+1);
            addOneRow2(root.right,v,d,index+1);
        }
    }


}

package leecode.二叉树的中序遍历;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/06/14 12:11
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        mid(root,list);
        return list;
    }

    private void mid(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        mid(root.left, list);
        list.add(root.val);
        mid(root.right,list);
    }
}

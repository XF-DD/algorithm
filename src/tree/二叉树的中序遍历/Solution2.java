package tree.二叉树的中序遍历;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/06/15 14:38
 */
public class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        mid(root,list);
        return list;
    }

    public void mid(TreeNode node ,ArrayList<Integer> list){
        if(node == null){
            return;
        }
        mid(node.left,list);
        list.add(node.val);
        mid(node.right,list);
    }

}

package tree.二叉树的前序遍历;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/06/15 14:33
 */
public class SolutionDG {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preorderTraversal(root,list);
        return list;
    }

    public void preorderTraversal(TreeNode root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        preorderTraversal(root.left,list);
        preorderTraversal(root.right,list);
    }
}

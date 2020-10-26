package tree.二叉树的后序遍历;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/06/15 15:13
 */
public class SolutionDG {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        check(root,list);
        return list;
    }

    private void check(TreeNode node ,ArrayList<Integer> list ){
        if(node == null){
            return;
        }
        check(node.left,list);
        check(node.right,list);
        list.add(node.val);
    }
}

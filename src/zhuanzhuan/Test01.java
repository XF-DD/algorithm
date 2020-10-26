package zhuanzhuan;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/09/03 15:11
 */
public class Test01 {
    public TreeNode test(TreeNode node){

        Queue<TreeNode> queue = new LinkedList<>();
        if(node == null){
            return null;
        }

        queue.add(node);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            TreeNode temp = poll.left;
            poll.left = poll.right;
            poll.right = temp;
            if(poll.left!=null)queue.add(poll.left);
            if(poll.right!=null)queue.add(poll.right);
        }
        return node;
    }


}

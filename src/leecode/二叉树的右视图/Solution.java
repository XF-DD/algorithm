package leecode.二叉树的右视图;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        LinkedList<TreeNode> queue = new LinkedList<>();
        int now = 1;
        int down = 0;
        boolean record = true;
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            now--;
            if(record){
                record = false;
                list.add(poll.val);
            }
            if(poll.right!=null){
                down++;
                queue.add(poll.right);
            }
            if(poll.left!=null){
                down++;
                queue.add(poll.left);
            }
            if(now == 0){
                now = down;
                down = 0;
                record = true;
            }
        }
        return list;
    }

}

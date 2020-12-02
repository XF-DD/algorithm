package hot100.对称的二叉树;

import Util.TreeNode;

import java.util.LinkedList;

/**
 * @Description https://leetcode-cn.com/problems/symmetric-tree/submissions/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-12-02 10:09:49
 */
public class Solution2 {

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        if(root.left == null && root.right == null){
            return true;
        }

        if(root.left == null || root.right == null){
            return false;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null){
                continue;
            }

            if(left == null || right == null){
                return false;
            }

            if(left.val != right.val){
                return false;
            }

            queue.offer(left.left);
            queue.offer(right.right);

            queue.offer(left.right);
            queue.offer(right.left);
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList<TreeNode> list = new LinkedList<>();
        list.offer(null);
        list.offer(null);
        list.offer(null);
        System.out.println(list.size());

    }
}

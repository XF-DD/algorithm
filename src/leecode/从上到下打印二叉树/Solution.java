package leecode.从上到下打印二叉树;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Author: XF-DD
 * @Date: 20/05/22 0:18
 * https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 */
public class Solution {
    public int[] levelOrder(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            res.add(poll.val);
            if(poll.left!=null){
                queue.add(poll.left);
            }
            if(poll.right!=null){
                queue.add(poll.right);
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}

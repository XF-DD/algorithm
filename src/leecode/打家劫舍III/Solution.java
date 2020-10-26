package leecode.打家劫舍III;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

//https://leetcode-cn.com/problems/house-robber-iii/
public class Solution {
    public int rob(TreeNode root) {
        int[] cal = cal(root);
        return Math.max(cal[0],cal[1]);
    }

    public int[] cal(TreeNode node){
        if(node == null) return new int[2];

        int[] left = cal(node.left);
        int[] right = cal(node.right);

        int[] result = new int[2];
        // 0是不偷，1是偷
        result[0] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        result[1] = node.val + left[0] + right[0];

        return result;
    }
}

package leecode.最大二叉树;

import Util.TreeNode;

//https://leetcode-cn.com/problems/maximum-binary-tree/
public class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(0,nums.length-1,nums);
    }

    public TreeNode build(int start,int end , int[] nums){
        if(start>end)
            return null;
        if(start == end)
            return new TreeNode(nums[start]);
        int max = start;
        int index = start;
        while (++index<=end){
            if(nums[max]<nums[index])
                max = index;
        }
        TreeNode treeNode = new TreeNode(nums[max]);
        treeNode.left = build(start,max-1,nums);
        treeNode.right = build(max+1,end,nums);
        return treeNode;
    }
}

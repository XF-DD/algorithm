package leecode.从前序与中序遍历序列构造二叉树;

import Util.TreeNode;

import java.util.HashMap;

/**
 * @Author: XF-DD
 * @Date: 20/05/22 0:26
 * https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 */
public class Solution {
    HashMap<Integer,Integer> map ;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length<1){
            return null;
        }
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        return buildTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder,int startP,int endP,int startI,int endI) {
        if(startP>endP){
            return null;
        }
        int indexI = map.get(preorder[startP]);
        int indexP = indexI-startI+startP;
        TreeNode root = new TreeNode(preorder[startP]);
        root.left = buildTree(preorder,inorder,startP+1,indexP,startI,indexI-1);
        root.right = buildTree(preorder,inorder,indexP+1,endP,indexI+1,endI);
        return root;
    }

    public static void main(String[] args) {
        int[] i = new int[]{3, 9, 20, 15, 7};
        int[] ints = {9, 3, 15, 20, 7};
        TreeNode treeNode = new Solution().buildTree(i, ints);
        System.out.println(treeNode.val);
        System.out.println(treeNode.left.val);
        System.out.println(treeNode.right.val);
    }
}

package Offer.二叉树中和为某一值的路径;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: XF-DD
 * @Date: 20/05/13 10:28
 * https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
 */
public class Solution {
    ArrayList<Integer> list;
    ArrayList<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        list = new ArrayList<>();
        result = new ArrayList<>();
        if(root == null){return result;}
        cal(root,sum,0);
        return result;
    }

    public void cal(TreeNode node,int sum,int current){
        list.add(node.val);
        current+=node.val;
        if(current == sum && node.left == null && node.right == null){
            ArrayList<Integer> arrayList = new ArrayList<>(list);
            result.add(arrayList);
        }else {
           if(node.left != null) {
               cal(node.left,sum,current);
           }
           if(node.right != null){
               cal(node.right,sum,current);
           }
        }
        list.remove(list.size()-1);
    }



}

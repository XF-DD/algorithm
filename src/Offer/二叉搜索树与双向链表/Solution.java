package Offer.二叉搜索树与双向链表;

import Util.Node;

//https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/
public class Solution {
    Node front;
    public Node treeToDoublyList(Node root) {
        if(root == null)
            return root;
        front = null;
        build(root);
        Node left = root;
        Node right = root;
        while (left.left!= null)
            left = left.left;
        while (right.right!=null)
            right = right.right;
        left.left = right;
        right.right = left;
        return left;
    }

    public void build(Node node){
        if (node == null)
            return;
        build(node.left);
        node.left = front;
        if(front != null) front.right = node;
        front = node;
        build(node.right);
    }

}

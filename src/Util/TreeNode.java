package Util;

import java.util.LinkedList;
import java.util.Stack;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public static TreeNode createTreeNode(int[] data){
        if(data.length<1){
            return null;
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        TreeNode res = new TreeNode(data[0]);
        list.addFirst(res);
        if(data.length == 1){return res;}

        for (int i = 1;;) {
            TreeNode node = list.removeFirst();
            node.left = new TreeNode(data[i++]);
            if(i == data.length){break;}
            list.addLast(node.left);
            node.right = new TreeNode(data[i++]);
            if(i == data.length){break;}
            list.addLast(node.right);
        }
        return res;
    }

}

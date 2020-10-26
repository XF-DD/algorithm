package leecode.二叉树的层序遍历;

import Util.TreeNode;
import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/05/13 11:01
 * https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 */
public class Solution {
    ArrayList<List<Integer>> result = new ArrayList<>();
    LinkedList<TreeNode> queue = new LinkedList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {return result;}

        queue.push(root);
        int next = 0;
        int count = 1;
        while (!queue.isEmpty()){
            TreeNode poll = queue.poll();
            list.add(poll.val);
            count --;
            if(poll.left != null){
                queue.add(poll.left);
                next++;
            }
            if(poll.right != null){
                queue.add(poll.right);
                next++;
            }
            if(count == 0){
                result.add(list);
                list = new ArrayList<>();
                count = next;
                next = 0;
            }
        }
        return result;
    }

}

package Offer.从上到下打印二叉树III;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-17 14:41:38
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> resList = new ArrayList<>();
        if(root!=null){
            queue.add(root);
        }

        while (!queue.isEmpty()){
            // 先打印奇数层
            int oddSize = queue.size();
            ArrayList<Integer> oddList = new ArrayList<>();
            for (int i = 0; i < oddSize; i++) {
                TreeNode treeNode = queue.pollFirst();
                oddList.add(treeNode.val);
                if(treeNode.left != null){
                    queue.addLast(treeNode.left);
                }
                if(treeNode.right != null){
                    queue.addLast(treeNode.right);
                }
            }

            int evenSize = queue.size();

        }
        // 写一半
        return null;
    }

}

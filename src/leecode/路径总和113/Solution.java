package leecode.路径总和113;

import java.util.ArrayList;
import java.util.List;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> data = new ArrayList<>();
        if(root == null)
            return null;
        int currentSum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        pathSum(root,currentSum,list,sum,data);
        return data;
    }

    void pathSum(TreeNode root,int currentSum,ArrayList<Integer> list,int sum,List<List<Integer>> data){
        currentSum+=root.val;
        list.add(root.val);

        boolean isLeaf = root.left==null&&root.right==null;
        if(currentSum==sum&&isLeaf){
            List<Integer> result = new ArrayList<>(list);
            data.add(result);
        }
        if(root.left!=null) {
            pathSum(root.left,currentSum,list,sum,data);
        }
        if(root.right!=null) {
            pathSum(root.right,currentSum,list,sum,data);
        }
        list.remove(list.size()-1);
    }
}

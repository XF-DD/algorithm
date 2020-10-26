package Offer.树的子结构;

import Util.TreeNode;

//https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) return false;
        if(A.val == B.val){
            if(check(A,B)) return true;
        }
        return isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    public boolean check(TreeNode A,TreeNode B){
        if(B == null)
            return true;
        if(A == null)
            return false;
        if(A.val != B.val)
            return false;
        else {
            return check(A.left,B.left) && check(A.right,B.right);
        }
    }
}

package Offer.树的子结构;

import Util.TreeNode;

/**
 * @Description https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2020-11-17 14:04:16
 */
public class Solution2 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A == null || B == null) {
            return false;
        }
        if(A.val == B.val){
            if(check(A,B)) {
                return true;
            }
        }
        return isSubStructure(A.left,B) || isSubStructure(A.right,B);
    }

    public boolean check(TreeNode A, TreeNode B){
        if(B == null){
            return true;
        }
        if(A == null){
            return false;
        }
        if(A.val != B.val){
            return false;
        }
        return check(A.left,B.left) && check(A.right,B.right);
    }
}

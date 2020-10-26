package Offer.二叉搜索树的后序遍历序列;

//https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/
public class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return check(postorder,0,postorder.length-1);
    }

    public boolean check(int[] data,int left,int right){
        if(right-left<=1) return true;
        int index = left;
        while (index<right && data[index]<data[right]) index++;
        int mid = index;
        while (index<right){
            if(data[index]<data[right])
                return false;
            index++;
        }
        return check(data,left,mid-1) && check(data,mid,right-1);
    }

    public static void main(String[] args) {
        boolean b = new Solution().verifyPostorder(new int[]{1,2,5,10,6,9,4,3});
        System.out.println(b);

    }
}

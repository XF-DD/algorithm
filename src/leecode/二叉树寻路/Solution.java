package leecode.二叉树寻路;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        if(label<1) return null;
        ArrayList<Integer> integers = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = (int)(Math.log(label) / Math.log(2));
        while (label>1){
            stack.push(label);
            n -- ;
            label = (int)(3*Math.pow(2,n)-label/2-1);
        }
        integers.add(1);
        while (!stack.empty()){
            integers.add(stack.pop());
        }
        return integers;
    }


    public static void main(String[] args) {
        System.out.println((int)(Math.log(10) / Math.log(2)));
    }
}

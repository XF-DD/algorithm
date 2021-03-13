package tree;

import Util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description 测试
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-10 21:01:11
 */
public class Test {

    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root!=null){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            TreeNode pop = stack.pop();
            list.add(pop.val);
            root = pop.right;
        }
        return list;
    }



}

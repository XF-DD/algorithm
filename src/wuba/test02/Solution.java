package wuba.test02;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author: XF-DD
 * @Date: 20/08/31 21:13
 */
public class Solution {
    public int question (int a, int b) {
        // write code here
        HashSet<Integer> set = new HashSet<>();
        int max = Math.max(a, b);
        int min = Math.min(a, b);



        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int pow = (int)Math.pow(i, 2);
            int k = pow - max;
            if(k<0){
                continue;
            }
            if(set.contains(k+min)){
                return k;
            }
            set.add(pow);
            if(k>500){
                break;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int question = solution.question(100, 200);
        System.out.println(question);
    }
}

package hot100.可被5整除的二进制前缀;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-01-14 11:23:48
 */
public class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        ArrayList<Boolean> list = new ArrayList<>();
        long num = 0;
        for (int i : A) {
            num = compute(i, num);
            boolean b = num % 5 == 0;
            list.add(b);
        }
        return list;
    }

    private long compute(int i,long num){
        num *= 2;
        num += i;
        if(num>9){
            num = num-10;
        }
        return num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1};
        List<Boolean> booleans = solution.prefixesDivBy5(ints);
        System.out.println(booleans);
    }
}

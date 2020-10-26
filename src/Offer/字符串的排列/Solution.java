package Offer.字符串的排列;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: XF-DD
 * @Date: 20/08/15 21:36
 */
public class Solution {

    HashSet<String> resSet = new HashSet<>();
    public String[] permutation(String s) {
        doBusiness(s,new HashSet<>(),new StringBuilder());
        String[] vo = new String[resSet.size()];
        Iterator<String> iterator = resSet.iterator();
        int index = 0;
        while (iterator.hasNext()){
            vo[index++] = iterator.next();
        }
        return vo;
    }

    private void doBusiness(String s , HashSet<Integer> set , StringBuilder builder){
        for (int i = 0; i < s.length(); i++) {
            if(set.contains(i)){
                continue;
            }
            set.add(i);
            builder.append(s.charAt(i));
            if(set.size() == s.length()){
                resSet.add(builder.toString());
            }else {
                doBusiness(s,set,builder);
            }
            builder.deleteCharAt(builder.length()-1);
            set.remove(i);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] abcs = solution.permutation("abc");
        System.out.println(Arrays.toString(abcs));
    }
}

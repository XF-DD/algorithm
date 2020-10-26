package Offer.把数组排成最小的数;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

//https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/
public class Solution {
    public String minNumber(int[] nums) {
        int len = nums.length;
        if(nums.length<1) return null;
        String[] strs = new String[len];
        for (int i = 0; i < len; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if((o1+o2).compareTo(o2+o1)>0) return 1;
                return -1;
            }
        });
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(strs[i]);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"1","5","4","3","-2"};

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.compareTo(o2)>0) return -1;
                return 1;
            }
        });
        System.out.println(Arrays.toString(strs));
    }
}

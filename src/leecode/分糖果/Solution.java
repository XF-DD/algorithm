package leecode.分糖果;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distributeCandies(int[] candies) {
        int len = candies.length;
        if(len < 2 || len%2 == 1 )
            return 0;
        Arrays.sort(candies);
        int count = 1;
        for (int i = 1; i < len; i++) {
            if(candies[i-1] != candies[i]){
                count++;
            }
        }
        return Math.min(len/2,count);
    }

    public int distributeCandiesBySet(int[] candies) {
        HashSet<Integer> integers = new HashSet<>();
        for(int i : candies)
            integers.add(i);
        return Math.min(candies.length/2,integers.size());
    }

    public static void main(String[] args) {

    }
}

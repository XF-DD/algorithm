package leecode.拥有最多糖果的孩子;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/06/01 11:49
 * //https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if(candies[i] > max){
               max = candies[i];
            }
        }
        for (int candy : candies) {
            if (extraCandies + candy >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}

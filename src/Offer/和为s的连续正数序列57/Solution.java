package Offer.和为s的连续正数序列57;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/09/04 10:01
 */
public class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> self = self(target);
        int[][] res = new int[self.size()][];
        for (int i = 0; i < self.size(); i++) {
            res[i] = self.get(i);
        }
        return res;
    }

    public List<int[]> self(int target) {
        int left = 1;
        int right = 1;
        int now = 0;
        ArrayList<int[]> list = new ArrayList<>();
        while (left<=target/2){
            if(now<target){
                now += right;
                right++;
                continue;
            }
            if(now>target){
                now -= left;
                left++;
            }
            else {
                int[] arr = new int[right-left];
                for (int i = left; i<right; i++){
                    arr[i-left] = i;
                }
                list.add(arr);
                now -= left;
                left++;
            }
        }
        return list;
    }
}

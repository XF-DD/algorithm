package leecode.一手顺子;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

//https://leetcode-cn.com/problems/hand-of-straights/
public class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        int len = hand.length;
        if(len%W != 0)
            return false;
        Arrays.sort(hand);
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int temp = hand[i];
            if(map.containsKey(temp))
                map.put(temp,map.get(temp)+1);
            else{
                map.put(temp,1);
                list.add(temp);
            }
        }

        for(int i:list){
            int num = map.get(i);
            if(num>0){
                for (int j = 1; j < W; j++) {
                    if(!map.containsKey(i+j) || map.get(i+j) < num) {
                        return false;
                    }
                    map.put(i+j,map.get(i+j)-num);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}

package hot100.前K个高频元素;

import java.util.*;

/**
 * @Author: XF-DD
 * @Date: 20/08/15 22:17
 */
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length<1){
            return new int[0];
        }
        HashMap<Integer, Integer> recordCountMap = new HashMap<>();
        HashMap<Integer, Set<Integer>> setHashMap = new HashMap<>();
        int maxSize = 1;

        for (int item : nums) {
            Integer record = recordCountMap.get(item);
            if(record == null){
                recordCountMap.put(item,1);
                addSet(setHashMap,item,1);
            }else {
                record += 1;
                recordCountMap.put(item,record);
                addSet(setHashMap,item,record);
                if(record > maxSize){
                    maxSize = record;
                }
            }
        }
        int[] res = new int[k];
        int index = 0;
        for(int i = maxSize; i>0 && index < k;i--){
            Set<Integer> set = setHashMap.get(i);
            for (Integer integer : set) {
                res[index++] = integer;
                if (index == k) {
                    break;
                }
            }
        }
        return res;
    }

    private void addSet(HashMap<Integer, Set<Integer>> map, int num, int time){
        if(map.get(time) == null){
            HashSet<Integer> set = new HashSet<>();
            set.add(num);
            map.put(time,set);
        }else {
            map.get(time).add(num);
        }
        if(time>1){
            map.get(time-1).remove(num);
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

    }
}

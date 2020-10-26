package wuba.test01;

import java.util.*;

/**
 * @Author: XF-DD
 * @Date: 20/08/31 20:29
 */
public class Solution {
    public ArrayList<String> findCommonString (ArrayList<ArrayList<String>> values) {
        // write code here
        int size = values.size();
        if(size<1){
            return new ArrayList<>();
        }

        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> resList = new ArrayList<>();
        values.forEach(list -> {
            HashSet<String> set = new HashSet<>();
            list.forEach(item ->{

                if(set.contains(item)){
                    return;
                }

                if(map.containsKey(item)){
                    Integer integer = map.get(item);
                    integer = integer+1;
                    if(integer.equals(size)){
                        resList.add(item);
                    }
                    set.add(item);
                    map.put(item,integer);
                }else {
                    set.add(item);
                    map.put(item,1);
                }

            });
        });
        return resList;
    }
}

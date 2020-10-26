package leecode.等式方程的可满足性;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: XF-DD
 * @Date: 20/06/08 10:40
 */
public class Solution {
    public boolean equationsPossible(String[] equations) {
        HashMap<Character, ArrayList<Character>> same = new HashMap<>();
        HashMap<Character, ArrayList<Character>> diff = new HashMap<>();

        for (String s : equations) {
            char x = s.charAt(0);
            char y = s.charAt(3);
            if(s.charAt(1) == '='){
                if(!exist(diff,x,y)){
                    return false;
                }
                add(same,x,y);
            }else if(s.charAt(1) == '!'){
                if(!exist(same,x,y)){
                    return false;
                }
                add(diff,x,y);
            }
        }
        return true;
    }

    public void add (HashMap<Character, ArrayList<Character>> map,char x, char y){
        if(!map.containsKey(x)){
            map.put(x,new ArrayList<>());
        }
        map.get(x).add(y);

        if(!map.containsKey(y)){
            map.put(y,new ArrayList<>());
        }
        map.get(y).add(x);

    }

    public boolean exist(HashMap<Character, ArrayList<Character>> map,char x, char y){
        if(map.containsKey(x)){
            for (Character c : map.get(x)) {
                if(c == y){
                    return false;
                }
            }
        }

        if(map.containsKey(y)){
            for (Character c : map.get(y)) {
                if(c == x){
                    return false;
                }
            }
        }
        return true;
    }
}

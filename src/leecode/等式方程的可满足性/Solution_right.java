package leecode.等式方程的可满足性;

import java.util.HashMap;

/**
 * @Author: XF-DD
 * @Date: 20/06/08 11:03
 */
public class Solution_right {

    HashMap<Character, Character> map;

    public boolean equationsPossible(String[] equations) {
        map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a'+i);
            map.put(c,c);
        }

        for (String s : equations) {
            if(s.charAt(1) == '='){
                setHead(s.charAt(0),s.charAt(3));
            }
        }

        for (String s : equations) {
            if(s.charAt(1) == '!'){
                if(find(s.charAt(0)).equals(find(s.charAt(3)))){
                    return false;
                }
            }
        }
        return true;
    }

    public void setHead(char x,char y){
        char x1 = find(x);
        char y1 = find(y);
        char min = x1<y1?x1:y1;
        char max = min==x1?y1:x1;
        map.put(max,min);
    }

    public Character find(char x){
        while (map.get(x) != x){
            x = map.get(x);
        }
        return x;
    }

    public static void main(String[] args) {
        int i = 1;
        char a = (char) ('a'+i);
        a += 1;
        System.out.println(a);
    }


}

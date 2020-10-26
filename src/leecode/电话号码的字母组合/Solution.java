package leecode.电话号码的字母组合;

import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
        int strLen = digits.length();
        ArrayList<String> result = new ArrayList<>();
        if(strLen<1)
            return result;
        HashMap<Character, ArrayList<Character>> map = new HashMap<>();
        map.put('2',new ArrayList<Character>(Arrays.asList('a','b','c')));
        map.put('3',new ArrayList<Character>(Arrays.asList('d','e','f')));
        map.put('4',new ArrayList<Character>(Arrays.asList('g','h','i')));
        map.put('5',new ArrayList<Character>(Arrays.asList('j','k','l')));
        map.put('6',new ArrayList<Character>(Arrays.asList('m','n','o')));
        map.put('7',new ArrayList<Character>(Arrays.asList('p','q','r','s')));
        map.put('8',new ArrayList<Character>(Arrays.asList('t','u','v')));
        map.put('9',new ArrayList<Character>(Arrays.asList('w','x','y','z')));
        HS(new Stack<Character>(),digits,0,map,result);
        return result;
    }

    public void HS(Stack<Character> stack, String str, int index, HashMap<Character, ArrayList<Character>> map,ArrayList<String> result){
        if(index == str.length()){
            StringBuilder stringBuilder = new StringBuilder();
            ArrayList<Character> characters = new ArrayList<>(stack);
            for (char c : characters) {
                stringBuilder.append(c);
            }
            result.add(stringBuilder.toString());
            return;
        }
        ArrayList<Character> characters = map.get(str.charAt(index));
        for (char c : characters) {
            stack.push(c);
            HS(stack,str,index+1,map,result);
            stack.pop();
        }
    }

    public static void main(String[] args) {
        List<String> strings = new Solution().letterCombinations("23");
        System.out.println(Arrays.toString(strings.toArray()));


    }

}

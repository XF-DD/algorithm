package slidingwindow.最小覆盖子串;

import java.util.HashMap;

/**
 * @Author: XF-DD
 * @Date: 20/09/20 10:39
 */
public class Solution {
    private HashMap<Character, Integer> recordMap = new HashMap<>();
    private HashMap<Character, Integer> targetMap = new HashMap<>();
    public String minWindow(String s, String t) {

        int indexL = 0;
        int indexR = -1;
        int resR = 0;
        int resL = 0;
        int resSize = Integer.MAX_VALUE;
        int size = 0;

        // 封装targetMap
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            targetMap.put(c,targetMap.getOrDefault(c,0)+1);
        }

        do {
            indexR++;
            char c = s.charAt(indexR);
            // 加进去
            boolean addFlag = add(c);
            // 多了一个满足条件的
            if(addFlag){
                size++;
            }

            // 已达到条件，记录窗口
            while (size == t.length()){
                if(indexR-indexL+1 < resSize){
                    resL = indexL;
                    resR = indexR+1;
                    resSize = indexR - indexL + 1;
                }
                // 左窗口右移
                char left = s.charAt(indexL);
                indexL++;
                boolean remove = remove(left);
                if(remove){
                    size--;
                }
            }

        }while (indexR<s.length()-1);

        return s.substring(resL,resR);
    }

    // recordMap中添加一个，并判断添加后是否与 targetMap相等
    private boolean add(char c){
        int sum = recordMap.getOrDefault(c, 0) + 1;
        recordMap.put(c,sum);
        return targetMap.getOrDefault(c, 0)>=(sum);
    }

    // recordMap中移除一个，并判断移除之前是否与 targetMap相等
    private boolean remove(char c){
        int difference = recordMap.getOrDefault(c,1);
        recordMap.put(c,difference -1);
        return targetMap.getOrDefault(c,0).equals(difference);
    }

    public static void main(String[] args) {
        String s ="aa";
        String t = "aa";
        Solution solution = new Solution();
        String s1 = solution.minWindow(s, t);
        System.out.println(s1);
    }
}

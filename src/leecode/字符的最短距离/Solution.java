package leecode.字符的最短距离;

//https://leetcode-cn.com/problems/shortest-distance-to-a-character/
public class Solution {
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        if(len<1)
            return null;
        int[] record = new int[len];
        int temp = len*-1;
        for (int i = 0; i < len; i++) {
            if(S.charAt(i) == C)
                temp = i;
            record[i] = i - temp;
        }

        temp = len*2;
        for (int i = len-1; i >=0 ; i--) {
            if(S.charAt(i) == C)
                temp = i;
            record[i] = Math.min(temp-i,record[i]);
        }

        return record;
    }
}

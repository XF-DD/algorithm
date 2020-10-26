package leecode.有效的括号字符串;

import java.util.Stack;

//https://leetcode-cn.com/problems/valid-parenthesis-string/
public class Solution {
    public boolean checkValidString(String s) {
        int lNum = 0;
        int lStar = 0;
        int rNum = 0;
        int rStar = 0;

        for (int l = 0,r=s.length()-1; l < s.length(); l++,r--) {
            char lc = s.charAt(l);
            char rc = s.charAt(r);

            if(lc == '(') lNum++;
            else if(lc == ')') lNum--;
            else lStar++;
            if(lStar+lNum<0) return false;

            if(rc == ')') rNum++;
            else if(rc == '(') rNum--;
            else rStar++;
            if(rStar+rNum<0) return false;
        }
        if(lStar<lNum || rStar<rNum)
            return false;
        return true;
    }
}

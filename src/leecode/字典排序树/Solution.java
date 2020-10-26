package leecode.字典排序树;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/lexicographical-numbers/
public class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 10 && i <= n; i++) {
            list.add(i);
            if(i*10<=n) come(n,list,i*10);
        }
        return list;
    }

    public void come(int num, ArrayList<Integer> list,int temp){
        for (int i = 0;temp<=num&&i<10;i++,temp++){
            list.add(temp);
            if(temp*10<=num) come(num,list,temp*10);
        }
    }
}

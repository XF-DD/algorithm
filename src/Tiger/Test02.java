package Tiger;

import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.*;

/**
 * @Author: XF-DD
 * @Date: 20/08/23 17:28
 */
public class Test02 {
    ArrayList<ArrayList<Integer>> resList;
    Set<Set<Integer>> resSet;
    public ArrayList<ArrayList<Integer>> combinationSum (int[] prices, int m) {
        // write code here
        resList = new ArrayList<>();
        resSet = new HashSet<>();
        count(prices,new HashSet<>(),m,0);
        for (Set<Integer> next : resSet) {
            ArrayList<Integer> indexList = new ArrayList<>(next);
            ArrayList<Integer> list = new ArrayList<>();
            indexList.forEach(item -> {
                list.add(prices[item]);
            });
            list.sort((o1, o2) -> o2 - o1);
            resList.add(list);
        }
        return resList;
    }

    private void count(int[] prices, HashSet<Integer> set, int m, int now){
        for (int i = 0; i < prices.length; i++) {
            if(set.contains(i)){
                continue;
            }
            set.add(i);
            now += prices[i];
            if(now == m){
                resSet.add(new HashSet<>(set));
                set.remove(i);
                now -= prices[i];

            }else if(now > m){
                set.remove(i);
                now -= prices[i];
            }else {
                count(prices,set,m,now);
                set.remove(i);
                now -= prices[i];
            }
        }
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        int[] ints = {1, 1, 3, 4, 5, 2};
        ArrayList<ArrayList<Integer>> arrayLists = test02.combinationSum(ints, 2);
        System.out.println(arrayLists);
    }

}

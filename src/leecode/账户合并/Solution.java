package leecode.账户合并;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: XF-DD
 * @Date: 20/06/12 10:23
 */
public class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        DSU dsu = new DSU(10001);
        HashMap<String, String> emailToName = new HashMap<>();
        HashMap<String, Integer> emailToId = new HashMap<>();
        int id = 0;
        for (List<String> account:accounts) {
            String name = null;
            for (String email : account) {
                if(name == null){
                    name = email;
                    continue;
                }
                emailToName.put(email,name);
                if(!emailToId.containsKey(email)){
                    emailToId.put(email,id++);
                }
                dsu.union(emailToId.get(account.get(1)),emailToId.get(email));
            }
        }
        HashMap<Integer, List<String>> res = new HashMap<>();
        for(String email : emailToName.keySet()){
            int index = dsu.find(emailToId.get(email));
            res.computeIfAbsent(index,x->new ArrayList<>()).add(email);
        }
        for(List<String> list:res.values()){
            Collections.sort(list);
            list.add(0,emailToName.get(list.get(0)));
        }

        return new ArrayList<>(res.values());
    }
}

class DSU{
    private int[] parent;
    public DSU(int num){
        parent = new int[num];
        for (int i = 0;i<num;i++) {
            parent[i] = i;
        }
    }

    public int find(int x){
        return parent[x]==x?x:find(parent[x]);
    }

    public void union(int x, int y){
        parent[find(x)] = find(y);
    }
}

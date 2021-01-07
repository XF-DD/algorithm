package hot100.省份数量;

import java.util.HashMap;

/**
 * @Description https://leetcode-cn.com/problems/number-of-provinces/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-01-07 13:57:56
 */
public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int size = isConnected.length;
        UnionFind unionFind = new UnionFind(size);
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(isConnected[i][j] == 1){
                    unionFind.union(i,j);
                }
            }
        }
        return unionFind.size;
    }


    /**
     * 并查集
     */
    class UnionFind {
        int[] roots;
        int size;

        public UnionFind(int n) {
            roots = new int[n];
            for (int i = 0; i < n; i++) {
                roots[i] = i;
            }
            size = n;
        }

        public int find(int i){
            if(i == roots[i]){
                return i;
            }
            return roots[i] = find(roots[i]);
        }

        public void union(int p, int q){
            int pRoot = find(p);
            int qRoot = find(q);
            if(pRoot!=qRoot){
                roots[pRoot] = qRoot;
                size--;
            }
        }
    }
}

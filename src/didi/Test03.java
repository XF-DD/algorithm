package didi;

import java.util.Scanner;

/**
 * @Author: XF-DD
 * @Date: 20/09/13 20:37
 */
public class Test03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dataCount = scanner.nextInt();
        for (int i = 0;i < dataCount;i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            UnionFind unionFind = new UnionFind(n);
            for (int j = 0;j < m;j++) {
                int p = scanner.nextInt();
                int q = scanner.nextInt();
                int cost = scanner.nextInt();
                if (cost <= k) {
                    unionFind.union(p, q);
                }
            }
            if (unionFind.count() == 1) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
class UnionFind {

    private int[] record;
    //岛屿数目
    private int count;

    public UnionFind(int n) {
        record = new int[n+1];
        for (int i = 0;i <= n;i++) {
            record[i] = i;
        }
        count = n;
    }

    private int find(int p) {
        if (p != record[p]) {
            record[p] = find(record[p]);
        }
        return record[p];
    }

    //造桥
    void union(int p, int q) {
        int pid = find(p);
        int qid = find(q);
        if (pid == qid) {
            return;
        }
        record[pid] = qid;
        count--;//联通的岛屿算成一个
    }

    public int count() {
        return count;
    }
}

/**
 * 2
 * 3 3 400
 * 1 2 200
 * 1 3 300
 * 2 3 500
 * 3 3 400
 * 1 2 500
 * 1 3 600
 * 2 3 700
 */

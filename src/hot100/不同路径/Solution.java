package hot100.不同路径;

/**
 * @Author: XF-DD
 * @Date: 20/08/16 13:42
 */
public class Solution {

    private int size = 0;

    public int uniquePaths(int m, int n) {
        dps(m,n);
        return size;
    }

    private void dps(int m, int n){
        if(m == 1&& n == 1){
            size ++;
            return;
        }
        if(m<1 || n<1){
            return;
        }
        dps(m-1,n);
        dps(m,n-1);
    }
}

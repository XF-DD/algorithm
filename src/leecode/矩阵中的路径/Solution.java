package leecode.矩阵中的路径;
//https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/
//深度优先
public class Solution {
    int[][] record ;
    public boolean exist(char[][] board, String word) {
        record = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j =0 ; j<board[0].length; j++)
                if(dfs(board,word,0,i,j))
                    return true;
        }
        return false;
    }

    public boolean dfs(char[][] board,String word,int index,int i,int j){
        if(index >= word.length() || index<0 || i < 0 || j<0 || i>=board.length || j >=board[0].length )
            return false;
        if(word.charAt(index)!=board[i][j] || record[i][j] == 1)
            return false;
        if(index == word.length()-1)
            return true;

        record[i][j] = 1;
        boolean res =
                dfs(board,word,index+1,i+1,j) ||
                dfs(board,word,index+1,i,j+1) ||
                dfs(board,word,index+1,i-1,j) ||
                dfs(board,word,index+1,i,j-1) ;
        record[i][j] = 0;
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.record = new int[3][3];
        char[][] ch = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
        boolean aab = solution.dfs(ch, "AAB", 0, 1, 1);
        System.out.println(aab);
    }
}

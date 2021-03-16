package hot100.单词搜索;

/**
 * @Description https://leetcode-cn.com/problems/word-search/
 * @Author XF-DD Email: xufei1@shein.com
 * @Date create in 2021-03-16 11:08:33
 */
public class Solution {

    public boolean exist(char[][] board, String word) {
        char c = word.charAt(0);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == c && exist(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean exist(char[][] board, String word,int index,int x, int y) {
        if(index == word.length()){
            return true;
        }

        if(x<0 || x==board.length || y<0 || y==board[0].length){
            return false;
        }

        char c = word.charAt(index);
        if(c != board[x][y]){
            return false;
        }
        board[x][y] = '*';
        boolean flag = exist(board, word, index + 1, x + 1, y) || exist(board, word, index + 1, x, y + 1)
                || exist(board, word, index + 1, x - 1, y) || exist(board, word, index + 1, x, y - 1);
        board[x][y] = c;
        return flag;
    }

}

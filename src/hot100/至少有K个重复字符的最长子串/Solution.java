package hot100.至少有K个重复字符的最长子串;

import javax.swing.text.StyledEditorKit;
import java.util.LinkedHashMap;

/**
 * @Author: XF-DD
 * @Date: 21/02/27 15:15
 */
public class Solution {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if(matrix.length == 0){
            return false;
        }

        int iMax = matrix.length;
        int jMax = matrix[0].length;

        int i = 0;
        int j = jMax-1;

        while (i<iMax && j>=0){

            if(matrix[i][j] == target){
                return true;
            }

            if(matrix[i][j] > target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }
}

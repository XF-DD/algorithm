package hot100.二维区域和检索矩阵不可变;

/**
 * @Author: XF-DD
 * @Date: 21/03/02 15:25
 */
public class NumMatrix {

    private int[][] record;

    public NumMatrix(int[][] matrix) {

        if(matrix.length<1){
            record = new int[0][0];
            return;
        }

        record = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i == 0 && j == 0){
                    record[i][j] = matrix[i][j];
                    continue;
                }
                if(i == 0){
                    record[i][j] = matrix[i][j] + record[i][j-1];
                    continue;
                }
                if(j == 0){
                    record[i][j] = matrix[i][j] + record[i-1][j];
                    continue;
                }
                record[i][j] = matrix[i][j] + record[i-1][j] + record[i][j-1] - record[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(row1 == 0 && col1 == 0){
            return record[row2][col2];
        }

        if(row1 == 0){
            return record[row2][col2] - record[row2][col1-1];
        }

        if(col1 == 0){
            return record[row2][col2] - record[row1-1][col2];
        }

        return record[row2][col2] + record[row1-1][col1-1] - record[row2][col1-1]- record[row1-1][col2];
    }
}

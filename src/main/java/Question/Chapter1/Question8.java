package Question.Chapter1;

import java.util.HashSet;
import java.util.Set;

public final class Question8 {

    private Question8() {}

    public static int[][] zeroMatrix(int[][] matrix) {
        Set<Integer> rowsToZero = new HashSet<>();
        Set<Integer> colsToZero = new HashSet<>();

        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                if (matrix[row][col] == 0) {
                    rowsToZero.add(row);
                    colsToZero.add(col);
                }
            }
        }

        for (int row : rowsToZero) {
            for (int col = 0; col < colCount; col++) {
                matrix[row][col] = 0;
            }
        }

        for (int col : colsToZero) {
            for (int row = 0; row < rowCount; row++) {
                matrix[row][col] = 0;
            }
        }

        return matrix;
    }
}

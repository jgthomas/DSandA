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

    public static int[][] zeroMatrixConstantSpace(int[][] matrix) {
        int rowColumnTracker = -1;

        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        for (int row = 0; row < rowCount; row++) {
            if (hasZero(matrix[row])) {
                if (rowColumnTracker == -1) {
                    rowColumnTracker = row;
                }

                boolean isTracker = rowColumnTracker == row;
                handleRow(isTracker, matrix[row]);
            }
        }

        printMatrix(matrix);

        for (int col = 0; col < colCount; col++) {
            if (matrix[rowColumnTracker][col] == 1) {
                for (int row = 0; row < rowCount; row++) {
                    matrix[row][col] = 0;
                }
            }
        }

        printMatrix(matrix);

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            printRow(row);
        }
        System.out.println();
    }

    private static void printRow(int[] row) {
        for (int pos : row) {
            System.out.print(pos + " ");
        }
    }

    private static void zeroRow(int[] row) {
        for (int pos = 0; pos < row.length; pos++) {
            row[pos] = 0;
        }
    }

    private static boolean hasZero(int[] row) {
        for (int item : row) {
            if (item == 0) {
                return true;
            }
        }
        return false;
    }

    private static void handleRow(boolean isTracker, int[] row) {
        if (isTracker) {
            for (int pos = 0; pos < row.length; pos++) {
                if (row[pos] == 0) {
                    row[pos] = 1;
                } else {
                    row[pos] = 0;
                }
            }
        } else {
            zeroRow(row);
        }
    }
}

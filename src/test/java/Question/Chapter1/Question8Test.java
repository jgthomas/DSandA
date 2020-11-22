package Question.Chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class Question8Test {

    @Test
    public void simpleMxN() {
        int[][] matrix = {
                {1, 2, 0},
                {3, 4, 5},
                {6, 7, 8},
                {0, 9, 10}
        };
        int[][] expected = {
                {0, 0, 0},
                {0, 4, 0},
                {0, 7, 0},
                {0, 0, 0}
        };

        assertArrayEquals(expected, Question8.zeroMatrix(matrix));
    }

    @Test
    public void allZerosInAnswer() {
        int[][] matrix = {
                {0, 0, 0},
                {3, 4, 5},
                {6, 7, 8},
                {7, 9, 10}
        };
        int[][] expected = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        assertArrayEquals(expected, Question8.zeroMatrix(matrix));
    }

    @Test
    public void noZerosInAnswer() {
        int[][] matrix = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8},
                {7, 9, 10}
        };
        int[][] expected = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8},
                {7, 9, 10}
        };

        assertArrayEquals(expected, Question8.zeroMatrix(matrix));
    }

    @Test
    public void simpleMxNConstantSpace() {
        int[][] matrix = {
                {1, 2, 0},
                {3, 4, 5},
                {6, 7, 8},
                {0, 9, 10}
        };
        int[][] expected = {
                {0, 0, 0},
                {0, 4, 0},
                {0, 7, 0},
                {0, 0, 0}
        };

        assertArrayEquals(expected, Question8.zeroMatrixConstantSpace(matrix));
    }

    @Test
    public void allZerosInAnswerConstantSpace() {
        int[][] matrix = {
                {0, 0, 0},
                {3, 4, 5},
                {6, 7, 8},
                {7, 9, 10}
        };
        int[][] expected = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        assertArrayEquals(expected, Question8.zeroMatrixConstantSpace(matrix));
    }

    @Test
    public void noZerosInAnswerConstantSpace() {
        int[][] matrix = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8},
                {7, 9, 10}
        };
        int[][] expected = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8},
                {7, 9, 10}
        };

        assertArrayEquals(expected, Question8.zeroMatrixConstantSpace(matrix));
    }
}

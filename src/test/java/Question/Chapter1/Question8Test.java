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
}

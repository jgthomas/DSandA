package Question.Chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question1BitVectorTest {

    @Test
    public void findsIsUnique() {
        String input = "reason";
        Question1BitVector question1BitVector = new Question1BitVector(input);
        assertTrue(question1BitVector.uniqueCharacters());
    }

    @Test
    public void findIsNotUnique() {
        String input = "doggies";
        Question1BitVector question1BitVector = new Question1BitVector(input);
        assertFalse(question1BitVector.uniqueCharacters());
    }
}

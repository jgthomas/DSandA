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

    @Test
    public void firstRepeat() {
        String input = "doggies";
        Question1BitVector question1BitVector = new Question1BitVector(input);
        assertEquals('g', question1BitVector.firstRepeatCharacter());
        assertFalse(question1BitVector.uniqueCharacters());
    }

    @Test
    public void firstRepeatNoRepeat() {
        String input = "reason";
        Question1BitVector question1BitVector = new Question1BitVector(input);
        assertEquals('\u0000', question1BitVector.firstRepeatCharacter());
    }

    @Test
    public void firstRepeatUpperCase() {
        String input = "DOGGIES";
        Question1BitVector question1BitVector = new Question1BitVector(input);
        assertEquals('G', question1BitVector.firstRepeatCharacter());
        assertFalse(question1BitVector.uniqueCharacters());
    }

    @Test
    public void firstRepeatMultiple() {
        String input = "doomed";
        Question1BitVector question1BitVector = new Question1BitVector(input);
        assertEquals('o', question1BitVector.firstRepeatCharacter());
        assertFalse(question1BitVector.uniqueCharacters());
    }

    @Test
    public void firstRepeatMultipleMixedCase() {
        String input = "Doomed";
        Question1BitVector question1BitVector = new Question1BitVector(input);
        assertEquals('o', question1BitVector.firstRepeatCharacter());
        assertFalse(question1BitVector.uniqueCharacters());
    }

    @Test
    public void firstRepeatWithNumbers() {
        String input = "tech101";
        Question1BitVector question1BitVector = new Question1BitVector(input);
        assertEquals('1', question1BitVector.firstRepeatCharacter());
        assertFalse(question1BitVector.uniqueCharacters());
    }
}

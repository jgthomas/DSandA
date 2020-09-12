package Question.Chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question1Test {

    @Test
    public void findsIsUnique() {
        String input = "reason";
        Question1 question1 = new Question1(input);
        assertTrue(question1.uniqueCharacters());
    }

    @Test
    public void findIsNotUnique() {
        String input = "doggies";
        Question1 question1 = new Question1(input);
        assertFalse(question1.uniqueCharacters());
    }
}

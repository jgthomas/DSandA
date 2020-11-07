package Question.Chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question5Test {

    @Test
    public void oneEditSameLength() {
        String first = "pale";
        String second = "bale";
        assertTrue(Question5.oneEditAway(first, second));
    }

    @Test
    public void noEditsSameLength() {
        String first = "pale";
        String second = "pale";
        assertTrue(Question5.oneEditAway(first, second));
    }

    @Test
    public void moreThanOneEditSameLength() {
        String first = "pale";
        String second = "pant";
        assertFalse(Question5.oneEditAway(first, second));
    }
}

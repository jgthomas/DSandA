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

    @Test
    public void oneEditEndRemoval() {
        String first = "pales";
        String second = "pale";
        assertTrue(Question5.oneEditAway(first, second));
    }

    @Test
    public void oneEditEndAddition() {
        String first = "pale";
        String second = "pales";
        assertTrue(Question5.oneEditAway(first, second));
    }

    @Test
    public void oneEditMiddleRemoval() {
        String first = "booms";
        String second = "boms";
        assertTrue(Question5.oneEditAway(first, second));
    }

    @Test
    public void oneEditMiddleAddition() {
        String first = "boms";
        String second = "booms";
        assertTrue(Question5.oneEditAway(first, second));
    }

    @Test
    public void moreThanOneEditLastDifferentLength() {
        String first = "pale";
        String second = "pally";
        assertFalse(Question5.oneEditAway(first, second));
    }

    @Test
    public void moreThanOneEditMiddleDifferentLength() {
        String first = "pale";
        String second = "polly";
        assertFalse(Question5.oneEditAway(first, second));
    }
}

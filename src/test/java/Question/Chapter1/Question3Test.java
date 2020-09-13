package Question.Chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question3Test {

    @Test
    public void basicURL() {
        String string = "Mr Man  ";
        int trueLength = 6;
        String expected = "Mr%20Man";
        assertEquals(expected, Question3.toURL(string, trueLength));
    }

    @Test
    public void fromBook() {
        String string = "Mr John Smith    ";
        int trueLength = 13;
        String expected = "Mr%20John%20Smith";
        assertEquals(expected, Question3.toURL(string, trueLength));
    }

    @Test
    public void longerInput() {
        String string = "Mr John Smith walks away        ";
        int trueLength = 24;
        String expected = "Mr%20John%20Smith%20walks%20away";
        assertEquals(expected, Question3.toURL(string, trueLength));
    }
}

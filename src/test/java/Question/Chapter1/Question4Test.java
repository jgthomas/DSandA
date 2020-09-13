package Question.Chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question4Test {

    @Test
    public void singleCharacterEvenPalindrome() {
        String string = "aaaa";
        assertTrue(Question4.isPalindromePermutation(string));
    }

    @Test
    public void singleCharacterOddPalindrome() {
        String string = "aaaaa";
        assertTrue(Question4.isPalindromePermutation(string));
    }

    @Test
    public void singleCharacterMixedCasePalindrome() {
        String string = "AaaA";
        assertTrue(Question4.isPalindromePermutation(string));
    }

    @Test
    public void evenPalindrome() {
        String string = "noon";
        assertTrue(Question4.isPalindromePermutation(string));
    }

    @Test
    public void evenNotPalindrome() {
        String string = "noonte";
        assertFalse(Question4.isPalindromePermutation(string));
    }

    @Test
    public void oddPalindrome() {
        String string = "tenet";
        assertTrue(Question4.isPalindromePermutation(string));
    }


    @Test
    public void fromBook() {
        String string = "Tact coa";
        assertTrue(Question4.isPalindromePermutation(string));
    }

    @Test
    public void sentence() {
        String string = "madam im adam";
        assertTrue(Question4.isPalindromePermutation(string));
    }

    @Test
    public void whiteSpaceOnly() {
        String string = "    ";
        assertFalse(Question4.isPalindromePermutation(string));
    }

    @Test
    public void emptyString() {
        String string = "";
        assertFalse(Question4.isPalindromePermutation(string));
    }

    @Test
    public void nullString() {
        assertFalse(Question4.isPalindromePermutation(null));
    }
}

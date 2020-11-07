package Question.Chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question2Test {

  @Test
  public void isPermutation() {
    String first = "pots";
    String second = "stop";
    assertTrue(Question2.arePermutationsHashMap(first, second));
    assertTrue(Question2.arePermutationsSortedList(first, second));
  }

  @Test
  public void includesSpace() {
    String first = "pot plants";
    String second = "plants pot";
    assertTrue(Question2.arePermutationsHashMap(first, second));
    assertTrue(Question2.arePermutationsSortedList(first, second));
  }

  @Test
  public void sameSetOfLettersNotPermutation() {
    String first = "loops";
    String second = "plops";
    assertFalse(Question2.arePermutationsHashMap(first, second));
    assertFalse(Question2.arePermutationsSortedList(first, second));
  }

  @Test
  public void differentLengths() {
    String first = "loops";
    String second = "plop";
    assertFalse(Question2.arePermutationsHashMap(first, second));
    assertFalse(Question2.arePermutationsSortedList(first, second));
  }
}

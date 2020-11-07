package Question.Chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question6Test {

  @Test
  public void compressedIsShorterSimple() {
    String string = "aaa";
    String expected = "3a";
    assertEquals(expected, Question6.compressString(string));
  }

  @Test
  public void compressedIsShorter() {
    String string = "aabcccccaaa";
    String expected = "2a1b5c3a";
    assertEquals(expected, Question6.compressString(string));
  }

  @Test
  public void compressedIsShorterMixedCase() {
    String string = "aaBbbcccccaaa";
    String expected = "2a1B2b5c3a";
    assertEquals(expected, Question6.compressString(string));
  }

  @Test
  public void compressedIsEqual() {
    String string = "aa";
    String expected = "aa";
    assertEquals(expected, Question6.compressString(string));
  }

  @Test
  public void compressedIsnotShorter() {
    String string = "abcdefg";
    String expected = "abcdefg";
    assertEquals(expected, Question6.compressString(string));
  }
}

package Question.Chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question1SortedArrayTest {

  @Test
  public void findsIsUnique() {
    String input = "reason";
    Question1SortedArray question1SortedArray = new Question1SortedArray(input);
    assertTrue(question1SortedArray.uniqueCharacters());
  }

  @Test
  public void findIsNotUnique() {
    String input = "doggies";
    Question1SortedArray question1SortedArray = new Question1SortedArray(input);
    assertFalse(question1SortedArray.uniqueCharacters());
  }

  @Test
  public void firstRepeat() {
    String input = "doggies";
    Question1SortedArray question1SortedArray = new Question1SortedArray(input);
    assertFalse(question1SortedArray.uniqueCharacters());
  }

  @Test
  public void firstRepeatNoRepeat() {
    String input = "reason";
    Question1SortedArray question1SortedArray = new Question1SortedArray(input);
    assertTrue(question1SortedArray.uniqueCharacters());
  }

  @Test
  public void firstRepeatUpperCase() {
    String input = "DOGGIES";
    Question1SortedArray question1SortedArray = new Question1SortedArray(input);
    assertFalse(question1SortedArray.uniqueCharacters());
  }

  @Test
  public void firstRepeatMultiple() {
    String input = "doomed";
    Question1SortedArray question1SortedArray = new Question1SortedArray(input);
    assertFalse(question1SortedArray.uniqueCharacters());
  }

  @Test
  public void firstRepeatMultipleMixedCase() {
    String input = "Doomed";
    Question1SortedArray question1SortedArray = new Question1SortedArray(input);
    assertFalse(question1SortedArray.uniqueCharacters());
  }

  @Test
  public void firstRepeatWithNumbers() {
    String input = "tech101";
    Question1SortedArray question1SortedArray = new Question1SortedArray(input);
    assertFalse(question1SortedArray.uniqueCharacters());
  }
}

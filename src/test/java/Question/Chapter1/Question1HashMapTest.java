package Question.Chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Question1HashMapTest {

  @Test
  public void findsIsUnique() {
    String input = "reason";
    Question1HashMap question1HashMap = new Question1HashMap(input);
    assertTrue(question1HashMap.uniqueCharacters());
  }

  @Test
  public void findIsNotUnique() {
    String input = "doggies";
    Question1HashMap question1HashMap = new Question1HashMap(input);
    assertFalse(question1HashMap.uniqueCharacters());
  }

  @Test
  public void firstRepeat() {
    String input = "doggies";
    Question1HashMap question1HashMap = new Question1HashMap(input);
    assertFalse(question1HashMap.uniqueCharacters());
    assertEquals('g', question1HashMap.firstRepeatCharacter());
  }

  @Test
  public void firstRepeatNoRepeat() {
    String input = "reason";
    Question1HashMap question1HashMap = new Question1HashMap(input);
    assertTrue(question1HashMap.uniqueCharacters());
    assertEquals('\u0000', question1HashMap.firstRepeatCharacter());
  }

  @Test
  public void firstRepeatUpperCase() {
    String input = "DOGGIES";
    Question1HashMap question1HashMap = new Question1HashMap(input);
    assertFalse(question1HashMap.uniqueCharacters());
    assertEquals('G', question1HashMap.firstRepeatCharacter());
  }

  @Test
  public void firstRepeatMultiple() {
    String input = "doomed";
    Question1HashMap question1HashMap = new Question1HashMap(input);
    assertFalse(question1HashMap.uniqueCharacters());
    assertEquals('o', question1HashMap.firstRepeatCharacter());
  }

  @Test
  public void firstRepeatMultipleMixedCase() {
    String input = "Doomed";
    Question1HashMap question1HashMap = new Question1HashMap(input);
    assertFalse(question1HashMap.uniqueCharacters());
    assertEquals('o', question1HashMap.firstRepeatCharacter());
  }

  @Test
  public void firstRepeatWithNumbers() {
    String input = "tech101";
    Question1HashMap question1HashMap = new Question1HashMap(input);
    assertFalse(question1HashMap.uniqueCharacters());
    assertEquals('1', question1HashMap.firstRepeatCharacter());
  }
}

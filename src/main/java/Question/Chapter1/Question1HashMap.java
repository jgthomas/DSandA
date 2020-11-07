package Question.Chapter1;

import java.util.HashMap;
import java.util.Map;

public class Question1HashMap {
  private final Map<Character, Integer> counts;
  private final String toCheck;
  private char repeat;

  public Question1HashMap(String input) {
    this.toCheck = input;
    this.counts = new HashMap<>();
  }

  public char firstRepeatCharacter() {
    return repeat;
  }

  public boolean uniqueCharacters() {
    for (int i = 0; i < toCheck.length(); i++) {
      char c = toCheck.charAt(i);

      if (!counts.containsKey(c)) {
        counts.put(c, 1);
      } else {
        repeat = c;
        return false;
      }
    }

    return true;
  }
}

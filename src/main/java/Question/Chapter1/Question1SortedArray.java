package Question.Chapter1;

import java.util.Arrays;

public class Question1SortedArray {
  private final char[] sortedChars;

  public Question1SortedArray(String input) {
    this.sortedChars = input.toCharArray();
    Arrays.sort(sortedChars);
  }

  public boolean uniqueCharacters() {
    int current = 0;
    int next = 1;

    while (next <= sortedChars.length - 1) {
      if (sortedChars[current] == sortedChars[next]) {
        return false;
      }

      current++;
      next++;
    }

    return true;
  }
}

package Question.Chapter1;

import java.util.Arrays;
import java.util.Map;

import Utility.Utility;

public final class Question2 {

  private Question2() {}

  /** O(n log n) solution, sorts the characters first */
  public static boolean arePermutationsSortedList(String first, String second) {

    if (first.length() != second.length()) {
      return false;
    }

    String firstSorted = sortString(first);
    String secondSorted = sortString(second);

    for (int i = 0; i < firstSorted.length(); i++) {
      if (firstSorted.charAt(i) != secondSorted.charAt(i)) {
        return false;
      }
    }

    return true;
  }

  private static String sortString(String string) {
    char[] stringChars = string.toCharArray();
    Arrays.sort(stringChars);
    return new String(stringChars);
  }

  /** O(n) solution using additional space for the hash tables */
  public static boolean arePermutationsHashMap(String first, String second) {

    if (first.length() != second.length()) {
      return false;
    }

    Map<Character, Integer> firstMap = Utility.buildCharacterMap(first);
    Map<Character, Integer> secondMap = Utility.buildCharacterMap(second);

    return firstMap.equals(secondMap);
  }
}

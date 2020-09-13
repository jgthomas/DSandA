package Question.Chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question2 {

    /**
     * O(n log n) solution, sorts the characters first
     */
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

    /**
     * O(n) solution using additional space for the hash tables
     */
    public static boolean arePermutationsHashMap(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        Map<Character, Integer> firstMap = checkCharacters(first);
        Map<Character, Integer> secondMap = checkCharacters(second);

        return firstMap.equals(secondMap);
    }

    private static Map<Character, Integer> checkCharacters(String string) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : string.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        return charMap;
    }
}

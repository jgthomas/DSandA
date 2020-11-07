package Question.Chapter1;

import Utility.Utility;

import java.util.Map;

public final class Question4 {

    private Question4() {}

    public static boolean isPalindromePermutation(String string) {

        if (string == null || nonWhitespaceLength(string) == 0) {
            return false;
        }

        Map<Character, Integer> charCountMap = Utility.buildCharacterMap(string.toLowerCase());

        if (charCountMap.keySet().size() == 1) {
            return true;
        }

        if (isEvenLength(string)) {
            return checkCharCounts(charCountMap) == 0;
        }

        return checkCharCounts(charCountMap) == 1;
    }

    /**
     * Even length strings require an even number of each character to be
     * a palindrome.
     *
     * Odd length strings can have one character appear an odd number of times,
     * but the other characters must appear an even number.
     */
    private static int checkCharCounts(Map<Character, Integer> charCountMap) {
        int sum = 0;
        for (Character c : charCountMap.keySet()) {
            if (isCountedCharacter(c)) {
                sum += charCountMap.get(c) % 2;
            }
        }

        return sum;
    }

    private static boolean isEvenLength(String string) {
        return nonWhitespaceLength(string) % 2 == 0;
    }

    private static int nonWhitespaceLength(String string) {
        return string.replaceAll(" ", "").length();
    }

    private static boolean isCountedCharacter(char c) {
        return !Character.isWhitespace(c);
    }
}

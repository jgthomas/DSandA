package Question.Chapter1;

import Utility.Utility;

import java.util.Map;

public class Question4 {

    public static boolean isPalindromePermutation(String string) {

        if (string == null || nonWhitespaceLength(string) == 0) {
            return false;
        }

        Map<Character, Integer> charCountMap = Utility.buildCharacterMap(string.toLowerCase());

        if (charCountMap.keySet().size() == 1) {
            return true;
        }

        int charCountCheck = checkCharCounts(charCountMap);

        if (nonWhitespaceLength(string) % 2 == 0) {
            return charCountCheck == 0;
        } else {
            return charCountCheck == 1;
        }
    }

    private static int checkCharCounts(Map<Character, Integer> charCountMap) {
        int sum = 0;
        for (Character c : charCountMap.keySet()) {
            if (!Character.isWhitespace(c)) {
                sum += charCountMap.get(c) % 2;
            }
        }

        return sum;
    }

    private static int nonWhitespaceLength(String string) {
        return string.replaceAll(" ", "").length();
    }
}

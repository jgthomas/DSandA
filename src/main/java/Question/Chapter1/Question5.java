package Question.Chapter1;

import java.util.Arrays;

public final class Question5 {

    private Question5() {}

    public static boolean oneEditAway(String  first, String second) {
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        if (firstChars.length == secondChars.length) {
            return oneAway(firstChars, secondChars);
        }

        if (Math.abs(firstChars.length - secondChars.length) > 1) {
            return false;
        }

        if (firstChars.length > secondChars.length) {
            return oneAwayDiffLengths(firstChars, secondChars);
        }

        return oneAwayDiffLengths(secondChars, firstChars);
    }

    /**
     * Requires each string be the same length
     */
    private static boolean oneAway(char[] firstChars, char[] secondChars) {
        return oneAway(firstChars, secondChars, 0);
    }

    private static boolean oneAway(char[] firstChars, char[] secondChars, int editCount) {
        int edits = editCount;

        for (int i = 0; i < firstChars.length; i++) {
            if (firstChars[i] != secondChars[i]) {
                edits++;
            }
        }

        return edits <= 1;
    }

    private static boolean oneAwayDiffLengths(char[] longer, char[] shorter) {
        int diffPoint = firstDifference(longer, shorter);

        // final char in shorter different, but longer also has one more
        if (diffPoint == shorter.length-1) {
            return false;
        }

        // all chars in shorter found in longer in sequence
        if (diffPoint == shorter.length) {
            return true;
        }

        // grab rest of each array, should now be same length
        char[] newFirst = Arrays.copyOfRange(longer, diffPoint+1, longer.length-1);
        char[] newSecond = Arrays.copyOfRange(shorter, diffPoint, shorter.length-1);

        return oneAway(newFirst, newSecond, 1);
    }

    private static int firstDifference(char[] longer, char[] shorter) {
        for (int i = 0; i < shorter.length; i++) {

            if (longer[i] != shorter[i]) {
                return i;
            }
        }

        return shorter.length;
    }
}

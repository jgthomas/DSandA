package Question.Chapter1;

public class Question5 {

    public static boolean oneEditAway(String  first, String second) {
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        if (first.length() == second.length()) {
            return oneAway(firstChars, secondChars);
        }

        return false;
    }

    /**
     * Requires each string be the same length
     */
    private static boolean oneAway(char[] firstChars, char[] secondChars) {
        int edits = 0;

        for (int i = 0; i < firstChars.length; i++) {
            if (firstChars[i] != secondChars[i]) {
                edits++;
            }
        }

        return edits <= 1;
    }
}

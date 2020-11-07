package Question.Chapter1;

public class Question5 {

    public static boolean oneEditAway(String  first, String second) {
        if (first.length() == second.length()) {
            return oneAway(first, second);
        }

        return false;
    }

    private static boolean oneAway(String first, String second) {
        int edits = 0;
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();

        for (int i = 0; i < first.length(); i++) {
            if (firstChars[i] != secondChars[i]) {
                edits++;
            }
        }

        return edits <= 1;
    }
}

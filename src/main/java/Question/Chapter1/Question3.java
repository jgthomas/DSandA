package Question.Chapter1;

public class Question3 {
    private static final char[] spaceHold = {'0', '2', '%'};

    public static String toURL(String string, int trueLength) {
        char[] chars = string.toCharArray();
        int nextChar = trueLength - 1;
        int moveTo = chars.length - 1;

        while (nextChar >= 0) {
            if (Character.isWhitespace(chars[nextChar])) {
                for (char c : spaceHold) {
                    chars[moveTo] = c;
                    moveTo--;
                }
            } else {
                chars[moveTo] = chars[nextChar];
                moveTo--;
            }

            nextChar--;
        }

        return new String(chars);
    }
}

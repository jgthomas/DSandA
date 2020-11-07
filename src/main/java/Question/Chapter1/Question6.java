package Question.Chapter1;

import Application.StringMaker;

public final class Question6 {

    private Question6() {}

    public static String compressString(String string) {
        StringMaker stringMaker = new StringMaker();

        int pos = 0;
        char currentChar;
        int count = 0;
        char[] stringChars = string.toCharArray();

        while (pos < stringChars.length) {
            currentChar = stringChars[pos];
            count++;
            pos++;

            while (pos < stringChars.length && stringChars[pos] == currentChar) {
                count++;
                pos++;
            }

            String compressedSection = count + String.valueOf(currentChar);
            stringMaker.add(compressedSection);
            count = 0;
        }

        String compressedString = stringMaker.toString();

        if (compressedString.length() < string.length()) {
            return compressedString;
        }

        return string;
    }
}

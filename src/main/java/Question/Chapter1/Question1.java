package Question.Chapter1;

public class Question1 {
    private static final char COMPARATOR = 'a';
    private final String toCheck;
    private int bitVector = 0;

    public Question1(String input) {
        this.toCheck = input;
    }

    public boolean uniqueCharacters() {

        for (int i = 0; i < toCheck.length(); i++) {
            int charValue = toCheck.charAt(i) - COMPARATOR;

            if (inBitVector(charValue)) {
                return false;
            } else {
                addToBitVector(charValue);
            }
        }

        return true;
    }

    private boolean inBitVector(int charValue) {
        return (bitVector & shiftByValue(charValue)) > 0;
    }

    private void addToBitVector(int charValue) {
        bitVector = bitVector | shiftByValue(charValue);
    }

    private int shiftByValue(int value) {
        return 1 << value;
    }
}

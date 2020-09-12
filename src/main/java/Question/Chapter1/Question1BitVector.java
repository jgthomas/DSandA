package Question.Chapter1;

public class Question1BitVector {
    private static final char COMPARATOR = 'a';
    private char repeat;
    private final String toCheck;
    private int bitVector = 0;

    public Question1BitVector(String input) {
        this.toCheck = input;
    }

    public char firstRepeatCharacter() {
        uniqueCharacters();
        return repeat;
    }

    public boolean uniqueCharacters() {

        for (int i = 0; i < toCheck.length(); i++) {
            char character = toCheck.charAt(i);
            int charValue = character - COMPARATOR;

            if (inBitVector(charValue)) {
                repeat = character;
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

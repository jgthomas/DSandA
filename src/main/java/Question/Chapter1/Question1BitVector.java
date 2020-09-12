package Question.Chapter1;

public class Question1BitVector {
    private static final char COMPARATOR = 'a';
    private char repeat;
    private final String toCheck;

    /**
     * initial vector: 0000
     */
    private int bitVector = 0;

    public Question1BitVector(String input) {
        this.toCheck = input;
    }

    public char firstRepeatCharacter() {
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

    /**
     * TRUE
     *
     * bitVector = 0000
     * charValue = b - a = 1 = 0001
     * shiftByValue(0001) = 0010
     *
     *   0000
     * & 0010
     * = 0000
     * = 0
     * = not previously in vector, return true
     *
     *
     * FALSE
     *
     * bitVector = 0010
     * charValue = b - a = 1 = 0001
     * shiftByValue(0001) = 0010
     *
     *   0010
     * & 0010
     * = 0010
     * = 2
     * = already in vector, return false
     */
    private boolean inBitVector(int charValue) {
        return (bitVector & shiftByValue(charValue)) > 0;
    }

    /**
     * bitVector = 0000
     * charValue = b - a = 1 = 0001
     * shiftByValue(0001) = 0010
     *
     *   0000
     * | 0010
     * = 0010
     *
     * bit is now set
     */
    private void addToBitVector(int charValue) {
        bitVector = bitVector | shiftByValue(charValue);
    }

    /**
     * value = 1 = 0001
     * 1 = 0001
     * 0001 << 1 = 2 = 0010
     */
    private int shiftByValue(int value) {
        return 1 << value;
    }
}

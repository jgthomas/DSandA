package Application;

import DataStructure.ResizeableArray;

public class StringMaker {
    private final ResizeableArray<Character> stringBits;

    public StringMaker() {
        this.stringBits = new ResizeableArray<>();
    }

    public void add(String string) {
        stringBits.addAll(stringToCharacters(string));
    }

    public void addAll(String[] strings) {
        for (String string : strings) {
            add(string);
        }
    }

    public int length() {
        return stringBits.size();
    }

    public String toString() {
        return new String(bufferToChars());
    }

    private Character[] stringToCharacters(String string) {
        return string.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
    }

    private char[] bufferToChars() {
        char[] chars = new char[stringBits.size()];

        for (int i = 0; i < stringBits.size(); i++) {
            chars[i] = stringBits.get(i);
        }

        return chars;
    }
}

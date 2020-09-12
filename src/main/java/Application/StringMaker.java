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

    public int length() {
        return stringBits.size();
    }

    private Character[] stringToCharacters(String string) {
        return string.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
    }
}

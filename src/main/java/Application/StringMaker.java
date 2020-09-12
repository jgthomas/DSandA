package Application;

import DataStructure.ResizeableArray;

import java.util.stream.Collectors;

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

    public String toString() {
        return stringBits.toList().stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }

    private Character[] stringToCharacters(String string) {
        return string.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
    }
}

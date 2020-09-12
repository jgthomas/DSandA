package Application;

import DataStructure.ResizeableArray;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    /*public String toString() {
        return stringBits.toList().stream()
                .map(Object::toString)
                .collect(Collectors.joining());
    }*/

    public String toString() {
        char[] chars = new char[stringBits.size()];
        IntStream.range(0, stringBits.size())
                .forEach(i -> chars[i] = stringBits.get(i));
        return new String(chars);
    }

    private Character[] stringToCharacters(String string) {
        return string.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
    }
}

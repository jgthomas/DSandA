package Utility;

import java.util.HashMap;
import java.util.Map;

public final class Utility {

    private Utility() {}

    public static Map<Character, Integer> buildCharacterMap(String string) {
        Map<Character, Integer> charMap = new HashMap<>();

        for (char c : string.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        return charMap;
    }
}

package Application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringMakerTest {

    @Test
    public void testLength() {
        StringMaker stringMaker = new StringMaker();
        stringMaker.add("hello");
        assertEquals(5, stringMaker.length());
    }

    @Test
    public void buildsCorrectly() {
        StringMaker stringMaker = new StringMaker();
        stringMaker.add("Hello,");
        stringMaker.add(" Dolly!");
        assertEquals("Hello, Dolly!", stringMaker.toString());
    }

    @Test
    public void buildsCorrectlyAddAll() {
        String[] strings = { "One", "Two", "Three"};
        StringMaker stringMaker = new StringMaker();
        stringMaker.addAll(strings);
        assertEquals("OneTwoThree", stringMaker.toString());
    }
}

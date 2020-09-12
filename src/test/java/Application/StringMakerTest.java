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
}

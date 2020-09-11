package DataStructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ResizeableArrayTest {
    @Test
    public void testDefaultSize() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>();
        assertEquals(4, resizeableArray.maxSize());
    }

    @Test
    public void testSpecifiedSize() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>(8);
        assertEquals(8, resizeableArray.maxSize());
    }

    @Test
    public void testAddAndGet() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>();
        Integer expected = 9;
        resizeableArray.add(expected);
        assertEquals(expected, resizeableArray.get(0));
    }

    @Test
    public void testAddAllAndGet() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>();
        Integer [] numbers = {0,1,2,3,4,5,6,7,8,9};
        resizeableArray.addAll(numbers);
        Integer expected = 9;
        assertEquals(expected, resizeableArray.get(9));
    }

    @Test
    public void testMaxLengthWithResize() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>();
        resizeableArray.add(9);
        resizeableArray.add(3);
        resizeableArray.add(9);
        resizeableArray.add(3);
        assertEquals(8, resizeableArray.maxSize());
    }

    @Test
    public void testResizeTwiceMaxSize() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>();
        Integer[] numbers = {0,1,2,3,4,5,6,7,8,9};
        resizeableArray.addAll(numbers);
        assertEquals(16, resizeableArray.maxSize());
    }

    @Test
    public void testCurrentLengthNoResize() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>();
        resizeableArray.add(9);
        resizeableArray.add(3);
        assertEquals(2, resizeableArray.size());
    }

    @Test
    public void testCurrentLengthWithResize() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>();
        resizeableArray.add(9);
        resizeableArray.add(3);
        resizeableArray.add(9);
        resizeableArray.add(3);
        assertEquals(4, resizeableArray.size());
    }

    @Test
    public void testPutInboundIndex() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>();
        resizeableArray.add(9);
        resizeableArray.add(3);
        resizeableArray.put(1, 22);
        Integer expected = 22;
        assertEquals(expected, resizeableArray.get(1));
    }

    @Test
    void testExceptionOutOfBoundsPutEmpty() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>(8);
        assertThrows(IndexOutOfBoundsException.class, () ->
                resizeableArray.put(8, 10));
    }

    @Test
    void testExceptionOutOfBoundsGetEmpty() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>(8);
        assertThrows(IndexOutOfBoundsException.class, () ->
                resizeableArray.get(8));
    }

    @Test
    void testExceptionOutOfBoundsPutBeyondLogicalSize() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>(8);
        Integer[] numbers = {0,1,2,3,4,5,6,7,8,9};
        resizeableArray.addAll(numbers);

        assertThrows(IndexOutOfBoundsException.class, () ->
                resizeableArray.put(12, 10));
    }

    @Test
    void testExceptionOutOfBoundsGetBeyondLogicalSize() {
        ResizeableArray<Integer> resizeableArray = new ResizeableArray<>(8);
        Integer[] numbers = {0,1,2,3,4,5,6,7,8,9};
        resizeableArray.addAll(numbers);

        assertThrows(IndexOutOfBoundsException.class, () ->
                resizeableArray.get(12));
    }
}

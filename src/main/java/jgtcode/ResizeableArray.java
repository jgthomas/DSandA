package jgtcode;

public class ResizeableArray<E> {
    private static final int RESIZE_FACTOR = 2;
    private static final int DEFAULT_SIZE = 4;
    private int arrayLen;
    private int currentPos;
    private E [] array;

    public ResizeableArray() {
        this(DEFAULT_SIZE);
    }

    public ResizeableArray(int size) {
        this.arrayLen = size;
        this.currentPos = 0;
        this.array = createArray(arrayLen);
    }

    public E get(int pos) {
        return array[pos];
    }

    public void put(int pos, E item) {
        array[pos] = item;
    }

    public void add(E item) {
        if (needsResizing()) {
            resizeArray();
        }

        array[currentPos] = item;
        currentPos++;
    }

    public void addAll(E [] items) {
        for (E item : items) {
            add(item);
        }
    }

    public int maxSize() {
        return arrayLen;
    }

    public int size() {
        return currentPos;
    }

    private void resizeArray() {
        int newArrayLen = RESIZE_FACTOR * arrayLen;
        E [] newArray = createArray(newArrayLen);
        System.arraycopy(array, 0, newArray, 0, arrayLen);
        array = newArray;
        arrayLen = newArrayLen;
    }

    private E [] createArray(int size) {
        @SuppressWarnings("unchecked")
        E[] arr = (E[]) new Object[size];
        return arr;
    }

    private boolean needsResizing() {
        return currentPos == arrayLen;
    }
}

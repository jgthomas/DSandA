package DataStructure;

public class ResizeableArray<E> {
    private static final int RESIZE_FACTOR = 2;
    private static final int DEFAULT_CAPACITY = 4;
    private int capacity;
    private int logicalSize;
    private E [] array;

    public ResizeableArray() {
        this(DEFAULT_CAPACITY);
    }

    public ResizeableArray(int capacity) {
        this.capacity = capacity;
        this.logicalSize = 0;
        this.array = createArray(this.capacity);
    }

    public E get(int pos) {
        if (outOfBounds(pos)) {
            throw new IndexOutOfBoundsException();
        }

        return array[pos];
    }

    public void put(int pos, E item) {
        if (outOfBounds(pos)) {
            throw new IndexOutOfBoundsException();
        }

        array[pos] = item;
    }

    public void add(E item) {
        if (needsResizing()) {
            resizeArray();
        }

        array[logicalSize] = item;
        logicalSize++;
    }

    public void addAll(E [] items) {
        for (E item : items) {
            add(item);
        }
    }

    public int maxSize() {
        return capacity;
    }

    public int size() {
        return logicalSize;
    }

    private void resizeArray() {
        int newArrayLen = RESIZE_FACTOR * capacity;
        E [] newArray = createArray(newArrayLen);
        System.arraycopy(array, 0, newArray, 0, capacity);
        array = newArray;
        capacity = newArrayLen;
    }

    private E [] createArray(int size) {
        @SuppressWarnings("unchecked")
        E[] arr = (E[]) new Object[size];
        return arr;
    }

    private boolean needsResizing() {
        return logicalSize == capacity - 1;
    }

    private boolean outOfBounds(int pos) {
        return pos >= logicalSize;
    }
}

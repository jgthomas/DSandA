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

    /**
     * Access a value at the specified position, within bounds of logical size
     *
     * @param pos The array index to access
     * @return The value at that position
     */
    public E get(int pos) {
        if (outOfBounds(pos)) {
            throw new IndexOutOfBoundsException();
        }

        return array[pos];
    }

    /**
     * Insert a value at the specified position, within bounds of logical size
     *
     * @param pos The array index to insert
     * @param item The value to be inserted
     */
    public void put(int pos, E item) {
        if (outOfBounds(pos)) {
            throw new IndexOutOfBoundsException();
        }

        array[pos] = item;
    }

    /**
     * Append an item to the end of the array, resizing if needed
     *
     * @param item The item to append
     */
    public void add(E item) {
        if (needsResizing()) {
            resizeArray();
        }

        array[logicalSize] = item;
        logicalSize++;
    }

    /**
     * Append all items to the end of the array
     *
     * @param items The items to append
     */
    public void addAll(E [] items) {
        for (E item : items) {
            add(item);
        }
    }

    public int capacity() {
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

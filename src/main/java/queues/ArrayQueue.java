package queues;

public class ArrayQueue<T> implements MyQueue<T> {

    private static final int MAX_SIZE = 10;
    private int size = 0;

    private Object[] array = new Object[MAX_SIZE];

    public void offer(T element) {
        if (size == MAX_SIZE) {
            throw new IllegalArgumentException(String.format("Maximum stack size: %s has been reached.", MAX_SIZE));
        }

        // put element on index - current incremented by one
        array[size++] = element;
    }

    public T poll() {
        // if no elements in queue - return null
        if (size == 0) {
            return null;
        }

        //  set returned value to queue[0]
        T value = (T) array[0];

        // decrease size - we are removing element
        size--;

        // move queue 1 place left
        System.arraycopy(array, 1, array, 0, size);

        // clear last element
        array[size] = null;

        return value;
    }

    public T peek() {
        if (size == 0) {
            return null;
        }

        return (T) array[0];
    }

    public int size() {
        return size;
    }
}

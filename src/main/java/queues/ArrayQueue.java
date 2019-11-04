package queues;

public class ArrayQueue<T> implements MyQueue<T> {

    private final int MAX_SIZE = 10;
    private int size = 0;

    private Object[] array = new Object[MAX_SIZE];

    public void offer(T element) {

    }

    public T poll() {
        return null;
    }

    public T peek() {
        return null;
    }

    public int size() {
        return 0;
    }
}

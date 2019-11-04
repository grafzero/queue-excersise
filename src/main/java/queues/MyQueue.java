package queues;

public interface MyQueue<T> {

    void offer(T element);

    T poll();

    T peek();

    int size();

}

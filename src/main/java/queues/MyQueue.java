package queues;

public interface MyQueue<T> {

    // add element
    void offer(T element);

    // get element
    T poll();

    // get element without removing
    T peek();

    // check size
    int size();

}

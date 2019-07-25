/**
 * Queue
 *
 * A generic implementation because I felt like losing hours today on
 * Stack Overflow (/s). Implementation is basically circular but
 * throws on under- or over-flow, rather than overwrites.
 */
public class Queue<T> {

    private T[] arr;
    private int head = 0;
    private int tail = 0;

    Queue (int size) {
        // See rant in README.md.
        // This can be pseudo-safely done because the value is never shared,
        // and the private methods which operate on it are also typed to <T>.
        @SuppressWarnings("unchecked")
        T[] arr = (T[]) new Object[size];
        this.arr = arr;
    }

    // O(1)
    public void enqueue (T el) throws Exception {
        if (head + arr.length == tail) throw new Exception("Queue overflow");
        arr[tail++ % arr.length] = el;
    }

    // O(1)
    public T dequeue () throws Exception {
        if (head == tail) throw new Exception("Queue underflow");
        return arr[head++ % arr.length];
    }
}

/**
 * OverQueue
 *
 * A generic implementation because I felt like losing hours today on
 * Stack Overflow (/s). Implementation is basically circular but
 * throws on under- or over-flow, rather than overwrites.
 */
public class OverQueue<T> {

    public static void main(String[] args) throws Exception {
        try {
            var q1 = new OverQueue<String>(5);
            q1.enqueue("hi");
            q1.enqueue("yo");

            var q2 = new OverQueue<String>(q1);

            System.out.println(q2.dequeue()); // hi
            System.out.println(q2.dequeue()); // yo
            System.out.println(q1.dequeue()); // hi

            Vehicle[] cars = {
                new Vehicle(1, 2, 3),
                new Vehicle(2, 3, 4)
            };
            var q3 = new OverQueue<Vehicle>(cars);
            System.out.println(q3.dequeue()); // Vehicle@78308db1
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private T[] arr;
    private int head = 0;
    private int tail = 0;

    OverQueue (int size) {
        @SuppressWarnings("unchecked")
        T[] arr = (T[]) new Object[size];
        this.arr = arr;
    }

    // copy constructor showing how privacy is by class, not instance
    OverQueue (OverQueue<T> q) {
        this.arr = q.arr.clone();
        this.head = q.head;
        this.tail = q.tail;
    }

    // overloaded constructor from initial value
    OverQueue (T[] arr) {
        this.arr = arr.clone();
        // legit implementation for head and tail skipped.
        this.tail = 1;
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

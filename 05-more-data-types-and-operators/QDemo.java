/**
 * QDemo
 */
public class QDemo {

    public static void main(String[] args) {
        Queue<Integer> queue1 = new Queue<Integer>(3);
        Queue<Integer> queue2 = new Queue<Integer>(3);
        try {
            // basic enqueue-dequeue
            queue1.enqueue(5);
            queue1.enqueue(3);
            queue1.enqueue(9);
            // queue1.enqueue(13); // Exception: Queue overflow
            System.out.println(queue1.dequeue()); // 5
            System.out.println(queue1.dequeue()); // 3
            System.out.println(queue1.dequeue()); // 9
            // System.out.println(queue1.dequeue()); // Exception: Queue underflow

            // interleaving enqueue and dequeue, across multiple queues
            queue1.enqueue(1);
            queue1.enqueue(2);
            queue2.enqueue(0);
            System.out.println(queue1.dequeue()); // 1
            queue1.enqueue(3);
            System.out.println(queue1.dequeue()); // 2
            System.out.println(queue2.dequeue()); // 0
            System.out.println(queue1.dequeue()); // 3
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

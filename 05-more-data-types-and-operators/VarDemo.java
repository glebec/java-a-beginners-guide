/**
 * VarDemo
 */
public class VarDemo {

    public static void main(String[] args) {
        var sortaPi = 3.14159; // double
        var myArr = new int[] { 1, 2, 3 }; // int[]
        var message = "Weave a circle round him thrice"; // String
        var word = message.substring(0, 5); // String
        var q = new Queue<Integer>(2); // Queue<Integer>
        try { q.enqueue(5); } catch (Exception e) { /* ignore */ }
        System.out.println(myArr[0] + ", " + sortaPi + ", " + word);
    }
}

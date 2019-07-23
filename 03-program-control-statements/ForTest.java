/**
 * ForTest
 */
public class ForTest {

    public static void main(String[] args) {
        int i = 0, j = 10;
        for (; i < j; i++, j -= 2) {
            System.out.println("i and j: " + i + " " + j);
        }
    }
}

/**
 * PowersOfTwo
 */
public class PowersOfTwo {

    public static void main(String[] args) {
        int LIMIT = 128;
        for (int i = 1; i <= LIMIT; i *= 2) {
            System.out.print(i + " ");
        }
    }
}

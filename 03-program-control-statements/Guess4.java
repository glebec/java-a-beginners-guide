import java.io.IOException;

/**
 * Guess4
 */
public class Guess4 {

    public static void main(String[] args) throws IOException {
        char answer = 'K', ch, ignore;
        do {
            System.out.println("Guess from A to Z");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) {
                System.out.println("Yep");
            } else {
                System.out.println("Nope");
            }
        } while (ch != answer);
    }
}

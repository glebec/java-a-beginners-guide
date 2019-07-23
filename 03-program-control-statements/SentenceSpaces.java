import java.io.IOException;

/**
 * SentenceSpaces
 */
public class SentenceSpaces {

    public static void main(String[] args) throws IOException {
        char input, space = ' ', period = '.';
        int sum = 0;
        do {
            input = (char) System.in.read();
            if (input == space) sum++;
        } while (input != period);
        System.out.println("There were " + sum + " spaces in the first sentence.");
    }
}

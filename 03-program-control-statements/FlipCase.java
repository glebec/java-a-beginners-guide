import java.io.IOException;

/**
 * FlipCase
 */
public class FlipCase {

    public static void main(String[] args) throws IOException {
        String result = "";
        char input;
        int changes = 0;

        System.out.println("Enter a sentence:");

        do {
            input = (char) System.in.read();
            if (isLower(input)) {
                input = toUpper(input);
                changes++;
            } else if (isUpper(input)) {
                input = toLower(input);
                changes++;
            }
            result += input;
        } while (input != '.');

        System.out.println(result);
        System.out.println("Made " + changes + " changes.");
    }

    private static boolean isLower(char letter) {
        return 'a' <= letter && letter <= 'z';
    }

    private static boolean isUpper(char letter) {
        return 'A' <= letter && letter <= 'Z';
    }

    private static char toLower(char letter) {
        return (char) (isUpper(letter) ? letter + 32 : letter);
    }

    private static char toUpper(char letter) {
        return (char) (isLower(letter) ? letter - 32 : letter);
    }
}

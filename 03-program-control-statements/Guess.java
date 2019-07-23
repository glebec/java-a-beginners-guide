/**
 * Guess
 */
public class Guess {

    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Guess the character: ");
        ch = (char) System.in.read();
        if (ch == answer) {
            System.out.println("Yep");
        } else if (ch < answer) {
            System.out.println("Nope, too low");
        } else {
            System.out.println("Nope, too high");
        }
    }
}

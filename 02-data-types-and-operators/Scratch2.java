/**
 * Scratch2
 */
public class Scratch2 {

    public static void main(String[] args) {
        char ch = '.';
        String phrase = "This compiles";
        String sentence = phrase + ch;
        System.out.println(sentence);

        boolean hmm = true;
        System.out.println("So does this: " + hmm);
        long x = 5;
        float y = 5;
        System.out.println("What happens here? " + (x + y)); // float, not long
    }
}

import java.io.IOException;

/**
 * Help
 */
public class Help {

    public static void main(String[] args) throws IOException {

        System.out.println("Help on:\n  1. if\n  2. switch");
        System.out.print("Choose one: ");

        char in = (char) System.in.read();

        switch (in) {
            case '1':
                System.out.println("if (condition) statement; else statement;");
                break;
            case '2':
                System.out.println("switch (exp) { case constant: stmt seq; break; }");
            default:
                System.out.println("Selection not found.");
                break;
        }
    }
}

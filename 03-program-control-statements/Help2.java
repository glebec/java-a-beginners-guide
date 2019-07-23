import java.io.IOException;

/**
 * Help2
 */
public class Help2 {

    public static void main(String[] args) throws IOException {

        char choice;
        do {
            System.out.println("Help on:\n  1. if\n  2. switch");
            System.out.print("Choose one: ");

            choice = (char) System.in.read();

            char ignore;
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            switch (choice) {
                case '1':
                    System.out.println("if (condition) statement; else statement;");
                    break;
                case '2':
                    System.out.println("switch (exp) { case constant: stmt seq; break; }");
                default:
                    System.out.println("Selection not found, quitting.");
                    break;
            }
        } while ('1' <= choice && choice <= '2');

    }
}

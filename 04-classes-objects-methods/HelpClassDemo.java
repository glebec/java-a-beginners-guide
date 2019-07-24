import java.io.IOException;

/**
 * HelpClassDemo
 */
public class HelpClassDemo {

    static final String MENU = "Help on:\n  1. If\n  2. For\n(q to quit)";

    public static void main(String[] args) throws IOException {

        while (true) {
            char choice;
            // get choice
            do {
                System.out.println(MENU);
                choice = getChar();
            } while (!isValid(choice));
            // detect quit
            if (choice == 'q') break;
            // show result
            System.out.println("\n");
            System.out.println(helpOn(choice));
        }

    }

    static char getChar () throws IOException {
        char ch = (char) System.in.read();
        char ignore;
        do {
            ignore = (char) System.in.read();
        } while (ignore != '\n');
        return ch;
    }

    static boolean isValid (char ch) {
        return ('1' <= ch && ch <= '2') || ch == 'q';
    }

    static String helpOn (char what) {
        switch (what) {
            case '1':
                return "If: `if (cond) stmt;`";
            case '2':
                return "For: `for (decls; cond; iter) stmt;`";
            default:
                return "unrecognized input";
        }
    }
}

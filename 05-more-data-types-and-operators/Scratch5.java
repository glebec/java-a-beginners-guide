import java.util.Arrays;

/**
 * Scratch5
 */
public class Scratch5 {

    public static void main(String[] args) {

        // self-test question 6:
        var len = "Java".length();
        var fst = "Java".charAt(0);
        System.out.println("Java length and first char: " + len + " " + fst);

        // irregular multidimensional array
        int[][] twoCols = new int[2][];
        // initialized inline
        twoCols[0] = new int[] { 1, 2, 3, 4 };
        // initialized piecemeal
        twoCols[1] = new int[3];
        twoCols[1][0] = 1;
        twoCols[1][1] = 2;
        // twoCols[1][2] = 0;
        System.out.println(Arrays.deepToString(twoCols));

        // intialized up front
        int[][] threeCols = {
            {1, 2, 3},
            {1, 2},
            {1, 2, 3, 4}
        };
        System.out.println(Arrays.deepToString(threeCols));

        // more experiments
        int[][] table1 = new int[2][3]; // [[0, 0, 0], [0, 0, 0]]
        int[][] table2 = new int[][] { {1, 2, 3}, {4, 5, 6} }; // [[1, 2, 3], [4, 5, 6]]
        int[][] table3 = new int[][] { {1, 2, 3}, {4, 5} }; // [[1, 2, 3], [4, 5]]

        debug(table1);
        debug(table2);
        debug(table3);

        // some string stuff
        String ex1 = "hello";
        String ex2 = "hello";
        System.out.println("string lits ==? " + (ex1 == ex2)); // true
        System.out.println("string lits `equals`? " + (ex1.equals(ex2))); // true

        String ex3 = new String("hello");
        String ex4 = new String("hello");
        System.out.println("boxed strings ==? " + (ex3 == ex4)); // false
        System.out.println("boxed strings `equals`? " + (ex1.equals(ex2))); // true

        System.out.println("raw str == boxed? " + (ex1 == ex3)); // false
        System.out.println("raw str `equals` boxed? " + (ex1.equals(ex3))); // true

        // substring index behavior
        String from3 = ex1.substring(3); // "lo"
        // String tooFar = ex1.substring(0, 9); // out of bounds exception
        // String negIndex = ex1.substring(0, -1); // out of bounds exception
        System.out.println("from3: " + from3);
    }

    private static void debug (int[][] table) {
        System.out.println(Arrays.deepToString(table));
    }
}

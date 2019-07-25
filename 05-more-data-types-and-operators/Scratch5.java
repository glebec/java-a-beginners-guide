import java.util.Arrays;

/**
 * Scratch5
 */
public class Scratch5 {

    public static void main(String[] args) {

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

    }

    private static void debug (int[][] table) {
        System.out.println(Arrays.deepToString(table));
    }
}

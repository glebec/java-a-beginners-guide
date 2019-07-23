/**
 * Scratch3
 */
public class Scratch3 {

    public static void main(String[] args) {
        // // turns out you cannot do this pseudo-antipattern in Java.
        // switch (true) {
        //     case 6 == 6:
        //         System.out.println("Six equals six.");
        //         break;
        //     default:
        //         System.out.println("Six does not equal six.");
        //         break;
        // }

        if (true) example: {
            System.out.println("In block");
            while (true) {
                break example;
            }
            // System.out.println("Dead code");
        }

        loop: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) /* worksButDifferent: */ {
                System.out.println("loopy");
                if (j > 0) break loop;
            }
        }
    }
}

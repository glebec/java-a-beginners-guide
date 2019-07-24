import java.util.Arrays;

/**
 * Bubble
 */
public class Bubble {

    public static void main(String[] args) {
        int[] ints = { 4, -2, 9, 0, 1, 1, 8, 15, -3 };
        System.out.println(Arrays.toString(ints));
        int[] sorted = sort(ints);
        System.out.println(Arrays.toString(sorted)); // sorted
        System.out.println(Arrays.toString(ints)); // but not mutated
    }

    public static int[] sort (int[] ints) {
        int[] cloned = ints.clone();
        for (int i = 1; i <= cloned.length; i++) {
            boolean sorted = true;
            for (int j = 0; j < cloned.length - i; j++) {
                if (cloned[j] > cloned[j + 1]) {
                    sorted = false;
                    int temp = cloned[j + 1];
                    cloned[j + 1] = cloned[j];
                    cloned[j] = temp;
                }
            }
            if (sorted) break;
        }
        return cloned;
    }
}

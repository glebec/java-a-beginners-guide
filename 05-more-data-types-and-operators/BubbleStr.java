import java.util.Arrays;

/**
 * BubbleStr
 */
public class BubbleStr {

    public static void main(String[] args) {
        String[] strs = { "apples", "banana", "apple", "zebra" };
        System.out.println(Arrays.toString(strs));
        String[] sorted = sort(strs);
        System.out.println(Arrays.toString(sorted)); // sorted
        System.out.println(Arrays.toString(strs)); // but not mutated
    }

    public static String[] sort (String[] strs) {
        String[] cloned = strs.clone();
        for (int i = 1; i <= cloned.length; i++) {
            boolean sorted = true;
            for (int j = 0; j < cloned.length - i; j++) {
                if (cloned[j].compareTo(cloned[j + 1]) > 0) {
                    sorted = false;
                    String temp = cloned[j + 1];
                    cloned[j + 1] = cloned[j];
                    cloned[j] = temp;
                }
            }
            if (sorted) break;
        }
        return cloned;
    }
}

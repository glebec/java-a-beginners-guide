import java.util.Arrays;

/**
 * QSDemo
 */
public class QSDemo {

    public static void main(String[] args) {
        char[] cs = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
        // Sorted: [a, d, i, j, p, r, x]
        System.out.println("Sorted: " + Arrays.toString(qsort(cs)));
    }

    static char[] qsort (char[] items) {
        return qs(items.clone(), 0, items.length - 1);
    }

    private static char[] qs (char[] items, int lBound, int rBound) {
        int middleIdx = (lBound + rBound) / 2;
        char middle = items[middleIdx];
        char swap;

        int lIdx = lBound;
        int rIdx = rBound;

        do {
            while (items[lIdx] < middle && lIdx < rBound) lIdx++;
            while (middle < items[rIdx] && lBound < rIdx) rIdx--;
            if (lIdx <= rIdx) {
                swap = items[rIdx];
                items[rIdx] = items[lIdx];
                items[lIdx] = swap;
                lIdx++;
                rIdx--;
            }
        } while (lIdx <= rIdx);

        if (lBound < rIdx) qs(items, lBound, rIdx);
        if (lIdx < rBound) qs(items, lIdx, rBound);

        return items;
    }
}

/**
 * ShowBits
 */
public class ShowBits {

    // number of low-order bits to display
    int size;

    ShowBits (int size) {
        this.size = size;
    }

    // actual arguments can be widened automatically
    String show (long val) {
        var mask = 1L; // previously long mask = 1;
        String bits = "";
        for (int i = 1; i <= size; i++, val >>= 1) {
            bits += (val & mask) == 1 ? "1" : "0";
            if (i % 8 == 0 && i != size) bits += " ";
        }
        return new StringBuilder(bits).reverse().toString();
    }
}

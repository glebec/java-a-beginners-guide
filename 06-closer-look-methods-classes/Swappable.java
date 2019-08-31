/**
 * Swappable
 */
public class Swappable {

    public static void main (String[] args) {
        var x1 = new Swappable(1);
        var x2 = new Swappable(2);
        System.out.println("Should be 1 2: " + x1.a + " " + x2.a);
        x1.swap(x2);
        System.out.println("Should be 2 1: " + x1.a + " " + x2.a);
        swap(x1, x2);
        System.out.println("Should be 1 2: " + x1.a + " " + x2.a);
    }

    int a;

    Swappable (int i) {
        a = i;
    }

    void swap (Swappable s2) {
        int temp = this.a;
        this.a = s2.a;
        s2.a = temp;
    }

    static void swap (Swappable s1, Swappable s2) {
        s1.swap(s2);
    }
}

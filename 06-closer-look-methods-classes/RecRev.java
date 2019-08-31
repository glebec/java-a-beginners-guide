/**
 * RecRev
 */
public class RecRev {

    public static void main (String[] args) {
        System.out.println(reverse("Hello World."));
    }

    // With overloading (idiomatic I presume):

    static String reverse (String s) {
        return reverse(s, s.length() - 1);
    }

    private static String reverse (String s, int idx) {
        if (idx < 0) return "";
        return s.charAt(idx) + reverse(s, idx - 1);
    }

    // // How I would do this without overloading (IMHO preferable):

    // static String reverse (String s) {
    //     return go(s, s.length() - 1);
    // }

    // private static String go (String s, int idx) {
    //     if (idx < 0) return "";
    //     return s.charAt(idx) + go(s, idx - 1);
    // }
}

/**
 * Overload
 */
public class Overload {

    public static void main(String[] args) {
        System.out.println("demo1:");
        demo(); // Demo 1
        System.out.println("demo2: " + demo(5)); // 6
        System.out.println("demo3: " + demo("Yo")); // 2
        System.out.println("demo4: " + demo(2, 3)); // GTE 5
    }

    private static void demo () {
        System.out.println("Demo 1");
    }

    private static int demo (int num) {
        return num + 1;
    }

    private static int demo (String str) {
        return str.length();
    }

    private static String demo (int num1, int num2) {
        return num1 + num2 < 5 ? "LT5" : "GTE 5";
    }
}

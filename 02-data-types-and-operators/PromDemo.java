/**
 * PromDemo
 */
public class PromDemo {

    public static void main(String[] args) {
        byte b = 10;
        int i = b * b;
        b = (byte) (b * b);
        System.out.println("i and b: " + i + " " + b);
    }
}

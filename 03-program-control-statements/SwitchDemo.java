/**
 * SwitchDemo
 */
public class SwitchDemo {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            switch (i) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("<= 5");
                    break;
                default:
                    System.out.println("Bigger than five.");
            }
        }
    }
}

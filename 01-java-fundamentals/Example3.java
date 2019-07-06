class Example3 {
    public static void main (String args[]) {
        int v = 10;
        double x = 10;
        // v = 10;
        // x = 10; // x = 10.0;
        System.out.println("Original value of v: " + v); // 10
        System.out.println("Original value of x: " + x); // 10.0
        System.out.println(); // newline

        v /= 4;
        x /= 4;

        System.out.println("New value of v: " + v); // 2
        System.out.println("New value of x: " + x); // 2.5
    }
}

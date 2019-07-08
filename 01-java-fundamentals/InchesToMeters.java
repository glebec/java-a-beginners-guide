class InchesToMeters {
    public static void main (String args[]) {
        double meters;
        int counter = 0;
        for (double inches = 1; inches <= 144; inches++) {
            meters = inches * 2.54 / 100;
            System.out.println(inches + " inches is " + meters + " meters.");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

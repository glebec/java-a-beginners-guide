class GalToLit {
    public static void main (String args[]) {
        double gallons = 10; // = args[0]; // don't know how to parse yet
        double litersPerGallon = 3.7854;
        double liters = gallons * litersPerGallon;
        System.out.println("Result: " + liters); // 37.854
    }
}

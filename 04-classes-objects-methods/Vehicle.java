/**
 * Vehicle
 */
public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    int getRange () {
        return fuelcap * mpg;
    }

    void printRange () {
        System.out.println("Range is " + getRange());
    }

    double fuelNeeded (int miles) {
        // Note that this compiles without the type coercion, because Java
        // implicitly coerces the entire return value AFTER integral division.
        return (double) miles / mpg;
    }
}

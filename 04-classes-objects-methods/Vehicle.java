/**
 * Vehicle
 */
public class Vehicle {

    int passengers;
    int fuelcap;
    int mpg;
    Vehicle (int passengers, int fl, int ml) {
        this.passengers = passengers; // one use case for `this`
        fuelcap = fl;
        mpg = ml;
    }

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

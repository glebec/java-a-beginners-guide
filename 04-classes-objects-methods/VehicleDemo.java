/**
 * VehicleDemo
 */
public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        // minivan.passengers = 7;
        // minivan.fuelcap = 16;
        // minivan.mpg = 21;

        Vehicle sportscar = new Vehicle(2, 14, 12);
        // sportscar.passengers = 2;
        // sportscar.fuelcap = 14;
        // sportscar.mpg = 12;

        int mRange = minivan.fuelcap * minivan.mpg;

        System.out.println("Minivan range is " + mRange + " miles.");

        System.out.println("Sportscar mpg is " + sportscar.mpg + ".");
        System.out.println("Sportscar range is " + sportscar.getRange());

        System.out.println("To go 10 miles, minivan needs "
            + minivan.fuelNeeded(10) + " gallons.");
    }
}

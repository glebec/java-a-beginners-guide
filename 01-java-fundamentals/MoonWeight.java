/**
 * MoonWeight
 */
public class MoonWeight {

    public static void main(String[] args) {
        double earthWeightLbs = 145;
        double moonLbsPerEarthLbs = 0.17;
        double moonWeightLbs = earthWeightLbs * moonLbsPerEarthLbs;
        System.out.println("Your weight on the Moon is " + moonWeightLbs + " lbs");
    }
}

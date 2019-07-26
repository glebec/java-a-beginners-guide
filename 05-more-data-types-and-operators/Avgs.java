/**
 * Avgs
 */
public class Avgs {

    public static void main(String[] args) {
        double[] nums = { 3, 6.5, 7, 8, 10, 10, 12, 13, 13.5, 17 };
        double sum = 0;
        for (var num : nums) sum += num;
        double avg = sum / nums.length;
        System.out.println(avg); // 10.0
    }
}

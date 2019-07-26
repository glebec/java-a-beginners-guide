/**
 * MinMax
 */
public class MinMax {

    public static void main(String[] args) {
        int[] nums = {5, 2, -4, 0, 99, 12, -32, 50};
        int min = nums[0];
        int max = nums[0];
        for (var num : nums) {
            min = min < num ? min : num;
            max = num < max ? max : num;
        }
        System.out.println("Min and max: " + min + ", " + max);
    }
}

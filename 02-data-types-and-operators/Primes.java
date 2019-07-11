/**
 * Primes
 */
public class Primes {

    public static void main(String[] args) {
        // sieve of Eratosthenes
        int[] maybePrimes = new int[99];
        for (int i = 2; i <= 100; i++) {
            maybePrimes[i - 2] = i;
        }
        for (int i = 2; i <= 100; i++) {
            for (int j = 2 * i; j <= 100; j += i) {
                maybePrimes[j - 2] = -1;
            }
        }
        for (int i = 2; i <= 100; i++) {
            if (maybePrimes[i - 2] != -1) {
                System.out.println(i);
            }
        }
    }
}

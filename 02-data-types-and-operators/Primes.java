/**
 * Primes
 */
public class Primes {

    public static void main(String[] args) {
        // sieve of Eratosthenes
        boolean[] isPrime = new boolean[101];
        for (int i = 2; i <= 100; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i*i <= 100; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= 100; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= 100; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}

public class LargestPrimeNumber {

    // Find divisors of any number and determine the highest prime divisor
    public static void printDivisors(int n) {
        int highestPrimeNumber = 0;

        // Invalid input if number is less than or equal to 1
        if (n <= 1) {
            System.out.println("Invalid value, try again");
            return;
        }

        // Iterate from 2 to the square root of n
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) { // Check if i is a divisor
                System.out.print(i + " ");
                if (isPrime(i)) { // Check if the divisor is prime
                    if (i > highestPrimeNumber) {
                        highestPrimeNumber = i; // Update highest prime number
                    }
                }
            }
        }

        System.out.println("\nHighest Prime Divisor: " + highestPrimeNumber);
    }


    // Check for prime numbers
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }
        return true; // No divisors found, so it's prime
    }


    // Method calling
    public static void main(String[] args) {
        printDivisors(36);
    }
}


// TODO Largest Prime
    /*
        The objective of this coding exercise is to write a small program that can determine the
        largest prime factor of a given number.
    */

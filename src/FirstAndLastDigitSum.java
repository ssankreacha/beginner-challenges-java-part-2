public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number <= 0) {
            return -1; // Return -1 if the number is negative or equal to 0
        }

        int lastDigit = number % 10; // Get the last digit by taking modulo 10
        int firstDigit = number;     // Initialize firstDigit with the original number

        // Extract the first digit by dividing by 10 until we're left with a single-digit number
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Sum of the first and last digits
        int sum = firstDigit + lastDigit;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(0)); // Should output 5 (203) / Should output -1 (0)
    }
}



// TODO First And Last Digit Sum
    /*
        The objective of this coding exercise is to write a small program that calculates the sum of the first
        and last digits of a given number.
    */


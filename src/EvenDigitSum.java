public class EvenDigitSum {

    public static int countEvenDigits(int number) {
        // Handle negative numbers
        if (number < 0) {
            return -1;
        }

        int sumTotal = 0;

        while (number > 0) {
            int digit = number % 10; // Extract the last digit

            // Check if the digit is even
            if (digit % 2 == 0) {
                sumTotal++;
            }

            number /= 10; // Remove the last digit
        }

        return sumTotal;
    }

    public static void main(String[] args) {
        System.out.println(countEvenDigits(20025));
    }
}



// TODO First And Last Digit Sum
    /*
        The objective of this coding exercise is to write a small program that calculates the sum of the even digits
        of a given number.
    */


public class PerfectNumber {

    public static void main(String[] args) {
        isPerfectNumber(-1);
    }

    public static void isPerfectNumber(int number) {

        // Handle invalid input
        if (number < 1) {
            System.out.println("Number is less than 1, please try again!");
            return;
        }

        // Calculate the sum of proper divisors and list each divisor
        int properSum = 0;
        System.out.print("Divisors of " + number + " are: ");

        // (number / 2) is the highest divisible and not including number
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                properSum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For line break

        // Check if the number is perfect
        if (properSum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}


// TODO Perfect Number
    /*
        The objective of this coding exercise is to write a small program that determines if a number is
        a perfect number.

        A perfect number is a positive integer which is equal to the sum of its proper positive divisors.

        Proper positive divisors are positive integers that fully divide the perfect number without leaving a
        remainder and exclude the perfect number itself.
    */

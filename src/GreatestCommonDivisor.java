public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        // Return -1 for invalid values
        if (first < 10 || second < 10) {
            return -1;
        }

        // Determine the smaller number to optimize the loop range
        int smallerNumber = Math.min(first, second);
        int greatestCommonDivisor = 1; // Initialize to 1 (smallest common divisor)

        // Check each number in the range from 1 to smallerNumber
        for (int j = 1; j <= smallerNumber; j++) {
            if (first % j == 0 && second % j == 0) {
                greatestCommonDivisor = j; // Update with the current divisor
            }
        }

        return greatestCommonDivisor; // Return the largest divisor found
    }

    public static void main(String[] args) {
        // Call the method and print the result
        int result = getGreatestCommonDivisor(10, 20);
        System.out.println("Greatest Common Divisor: " + result); // Should output 10
    }
}



// TODO GreatestCommonDivisor
    /*
        The objective of this coding exercise is to write a small program that returns the greatest
        common divisor of two numbers.
    */
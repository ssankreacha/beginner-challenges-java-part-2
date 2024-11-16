import java.util.Scanner;

public class MinAndMax {

    public static String theMinMaxValue() {

        Integer minNumber = null;
        Integer maxNumber = null;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please type a number of any value (or type any non-integer to quit): ");

            // Check if the input is an integer
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                // Set initial values for minNumber and maxNumber
                if (minNumber == null || number < minNumber) {
                    minNumber = number;
                }
                if (maxNumber == null || number > maxNumber) {
                    maxNumber = number;
                }

                System.out.println("Current minimum: " + minNumber + ", Current maximum: " + maxNumber);
            } else {
                // If a non-integer is entered, break out of the loop
                System.out.println("Non-integer input detected. Ending program.");
                break;
            }
            scanner.nextLine(); // Clear the input buffer
        }

        scanner.close();

        // Returning the result as a string
        return "Final minimum: " + minNumber + ", Final maximum: " + maxNumber;
    }

    public static void main(String[] args) {
        System.out.println(theMinMaxValue());
    }
}

// TODO Min Max Value
    /*
        Create a program that repeatedly asks a user for an integer and breaks when the user inputs a string or char. The
        program should print out or return the minValue and maxValue.
    */

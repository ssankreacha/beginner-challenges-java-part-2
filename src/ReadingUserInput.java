import java.util.Scanner;
public class ReadingUserInput {

    public static String readingUserInput() {
        int sum = 0;
        int count = 0; // Counter to track the number of inputs
        Scanner scanner = new Scanner(System.in);

        // Loop until five inputs have been taken
        while (count < 5) {
            System.out.println("Please enter a number: ");
            // Check if the next input is a valid integer
            if (scanner.hasNextInt()) {
                int userInput = scanner.nextInt();
                sum += userInput;
                count++; // Increment the counter only for valid inputs
            } else {
                // If input is not an integer, prompt again
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
            }
        }

        scanner.close();
        return "The total is " + sum;
    }

    public static void main(String[] args) {
        System.out.println(readingUserInput());
    }
}

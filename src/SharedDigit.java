public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigits(34, 43)); // Expected output: true (3 and 4 are shared)
        System.out.println(hasSharedDigits(9, 34)); // Expected output: false (no shared digits)
    }

    public static boolean hasSharedDigits(int firstNumber, int secondNumber) {
        // Check if both numbers are within the range 10 to 99
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false; // Return false if any number is out of range
        }

        // Extract digits of firstNumber
        int firstDigit1 = firstNumber % 10;  // Last digit of firstNumber
        int firstDigit2 = firstNumber / 10;  // First digit of firstNumber

        // Extract digits of secondNumber
        int secondDigit1 = secondNumber % 10;  // Last digit of secondNumber
        int secondDigit2 = secondNumber / 10;  // First digit of secondNumber

        // Check for any shared digit between the two numbers
        if (firstDigit1 == secondDigit1 || firstDigit1 == secondDigit2 ||
                firstDigit2 == secondDigit1 || firstDigit2 == secondDigit2) {
            return true;
        }

        // No shared digits were found
        return false;
    }
}


// TODO Digit Sum Challenge
    /*
        The objective of this coding exercise is to write a small program that checks if there's a digit that
        appears in both numbers.
    */
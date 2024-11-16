public class AllFactors {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid value, please try again");
            return;
        }

        // Print all factors of the given number
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {  // Check if i is a factor of number
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printFactors(6); // Expected output: Factors of 10 are: 1 2 5 10
    }
}


// TODO Last Digit Checker
    /*
        The objective of this coding exercise is to write a small program that prints out all the
        factors of a given number.
    */
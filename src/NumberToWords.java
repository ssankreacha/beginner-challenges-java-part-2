public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(500);
    }

    // Number to words
    public static void numberToWords(int number) {

        // Basic error handling
        if (number < 1) {
            System.out.println("Invalid value, please try again!");
            return; // Exit if the number is invalid
        }

        System.out.println("Digits of " + number + " in words are:");

        // Use StringBuilder to collect words for each digit
        StringBuilder numberWords = new StringBuilder();

        // Loop through each digit
        while (number > 0) {
            int lastDigit = number % 10; // Get the last digit

            // Convert the last digit to its word and append it to numberWords
            switch (lastDigit) {
                case 0: numberWords.append("Zero "); break;
                case 1: numberWords.append("One "); break;
                case 2: numberWords.append("Two "); break;
                case 3: numberWords.append("Three "); break;
                case 4: numberWords.append("Four "); break;
                case 5: numberWords.append("Five "); break;
                case 6: numberWords.append("Six "); break;
                case 7: numberWords.append("Seven "); break;
                case 8: numberWords.append("Eight "); break;
                case 9: numberWords.append("Nine "); break;
            }

            number /= 10; // Remove the last digit
        }

        // Reverse the collected words and print
        System.out.println(numberWords);
    }
}


// TODO Number To Words
    /*
        The objective of this coding exercise is to write a small program that prints out the number in words.
    */
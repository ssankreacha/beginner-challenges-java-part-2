public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        // Negative numbers are not palindromes
        if (number < 0) {
            return false;
        }

        // Convert the number to a string using StringBuilder
        StringBuilder userInput = new StringBuilder();
        userInput.append(number);

        // Reverse the string and convert it back to a string for comparison
        String reversedInput = userInput.reverse().toString();

        // Check if the reversed string is equal to the original number string
        return reversedInput.equals(String.valueOf(number));
    }


    public static void main(String[] args) {
        boolean result = isPalindrome(212);
        System.out.println(result);
    }
}


// TODO Number Palindrome
    /*
        The objective of this coding exercise is to write a small program that checks if a number is a palindrome.
    */


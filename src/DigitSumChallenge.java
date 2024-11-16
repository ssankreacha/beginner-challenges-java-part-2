public class DigitSumChallenge {

    public static void main(String[] args) {
        
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }
        sum += number;
        return sum;
    }

}

// TODO Digit Sum Challenge
    /*
       - Your task is to write a method with the name sumDigits that has a single parameter named number,
       of type int, and it should return an int.

       - The method should only take a number that is a positive number.
       - If a negative number is passed, it should return -1, meaning an invalid value was passed.
       - The method should parse out each digit from the number and sum the digits up.

       For example, if '125' as a value was passed through the method, the code should sum each digit.
       In this case 1 + 2 + 5 = 8, and should return 8.

     */
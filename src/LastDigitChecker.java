public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
            return false;
        }

        // Establish last digit for each number
        int lastDigitForX = x % 10;
        int lastDigitForY = y % 10;
        int lastDigitForZ = z % 10;

        // Check whether each last digit equals each other
        if (lastDigitForX == lastDigitForY || lastDigitForY == lastDigitForZ || lastDigitForX == lastDigitForZ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }
}

// TODO Last Digit Checker
    /*
        The objective of this coding exercise is to write a small program that checks if at least two of the
        numbers have the same rightmost digit.
    */
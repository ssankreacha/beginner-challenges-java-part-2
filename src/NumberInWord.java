public class NumberInWord {

    public static void printNumberInWord(int number) {
        switch(number) {
            case 0 -> System.out.print("ZERO"); case 1 -> System.out.print("ONE");
            case 2 -> System.out.print("TWO"); case 3 -> System.out.print("THREE");
            case 4 -> System.out.print("FOUR"); case 5 -> System.out.print("FIVE");
            case 6 -> System.out.print("SIX"); case 7 -> System.out.print("SEVEN");
            case 8 -> System.out.print("EIGHT"); case 9 -> System.out.print("NINE");
            default -> System.out.print("Number is not presented, try again!");
        }
    }

    public static void main(String[] args) {
        printNumberInWord(-1);
    }
}

// TODO Number In Word
    /*
    - Write a method called printNumberInWord. The method has one parameter number which is the whole number.
    - The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9
    or other for any other number including negative numbers.
    - You can use if-else statement or switch statement whatever is easier for you.

    NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
    NOTE: Do not add main method to solution code.
    */
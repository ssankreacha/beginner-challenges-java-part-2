public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        // Negative input handling
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Use big bags as much as possible without exceeding the goal
        int bigBagsUsed = Math.min(goal / 5, bigCount);
        int remainingGoal = goal - bigBagsUsed * 5;

        // Check if the remaining goal can be met with small bags
        if (remainingGoal <= smallCount) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));  // Output should be false
        System.out.println(canPack(1, 0, 5)); // Output should be true
        System.out.println(canPack(0, 5, 4));  // Output should be true
        System.out.println(canPack(2, 1, 5));  // Output should be true
    }
}


// TODO Flour Pack Problem
    /*
        The objective of this coding exercise is to write a small program, that given a number of small and large flour
        bags and a target weight, it can determine if a package can be assembled.

        bigCount represents count of big flour bags, 5kg each
        smallCount represents count of small flour bags, 1 kg each
        goal represents goal amount of kilos of flour needed to assemble a package
        Thus, bigCount + smallCount >= goal, returning true.
    */
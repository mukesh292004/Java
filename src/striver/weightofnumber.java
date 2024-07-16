import java.util.*;

public class WeightCalculator {

    // Method to calculate weight based on the given conditions
    public static int calculateWeight(int[] numbers) {
        int sumOfWeights = 0;

        for (int num : numbers) {
            // Condition 1: 5 if a perfect square
            if (isPerfectSquare(num)) {
                sumOfWeights += 5;
            }
            // Condition 2: 4 if multiple of 4 and divisible by 6
            else if (num % 4 == 0 && num % 6 == 0) {
                sumOfWeights += 4;
            }
            // Condition 3: 3 if even number
            else if (num % 2 == 0) {
                sumOfWeights += 3;
            }
            // Default: No additional weight for other cases
        }

        return sumOfWeights;
    }

    // Helper method to check if a number is a perfect square
    private static boolean isPerfectSquare(int num) {
        if (num < 0)
            return false;

        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    // Example usage
    public static void main(String[] args) {
        int[] numbers = {10, 36, 54, 89, 12};
        int sumOfWeights = calculateWeight(numbers);
        System.out.println("Sum of weights: " + sumOfWeights);
    }
}

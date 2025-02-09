
// Finding the Factorial of a Number
// Difficulty: Easy
// Topics: Basic Programming, Mathematical Computations
// Description: Write a program to compute the factorial of a given number.
// Example:
// Input: number = 5
// Output: 120
// Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.

public class Factorial_num {
    public static int factNum(int num) {
        if (num > 1) {
            int fact = 1;
            for (int i = 1; i < num + 1; i++) {
                fact *= i;
            }

            return fact;
        }
        return 1;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(factNum(num));
    }
}

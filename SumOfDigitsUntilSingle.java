// Calculating the Sum of Digits of a Number Until Single Digit
// Difficulty: Medium
// Topics: Mathematical Computations
// Description: Write a program to keep summing the digits of a number until a single digit is obtained.
// Example:
// Input: number = 9875
// Output: 2
// Explanation: The sum of digits is 9 + 8 + 7 + 5 = 29, and then 2 + 9 = 11, and finally 1 + 1 = 2.

public class SumOfDigitsUntilSingle {

    
    public static int sumUntilSingle(int input) {
        while (input >= 10) { 
            int sum = 0;
            while (input > 0) {
                sum += input % 10; 
                input /= 10; 
            }
            input = sum; 
        }
        return input;
    }

    public static void main(String[] args) {
        int input = 9875; // Example input
        System.out.println("The sum of digits until a single digit is: " + sumUntilSingle(input));
    }
}

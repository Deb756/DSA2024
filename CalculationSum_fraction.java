// Calculating the Sum of a Series (1 + 1/2 + 1/3 + ... + 1/n)
// Difficulty: Medium
// Topics: Mathematical Computations
// Description: Write a program to calculate the sum of the series 1 + 1/2 + 1/3 + ... + 1/n up to the nth term.
// Example:
// Input: n = 4
// Output: 2.083333
// Explanation: Sum of the series is 1 + 1/2 + 1/3 + 1/4 ≈ 2.083333.


public class CalculationSum_fraction {
    public static double calcSum(int inp)
    {
        int count = 1;
        double sum = 0;
        for(int i=0;i<inp;i++)
        {
            double res = (double) 1/(count+i);
            // System.out.println(res);
            sum += res;
        }
        return sum;
    }
    public static void main(String[] args) {
        int input = 4;
        System.out.println(calcSum(input));
    }
}

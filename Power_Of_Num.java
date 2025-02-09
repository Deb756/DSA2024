import java.util.Scanner;

/**
Calculating the Power of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the power of a number.
Example:
Input: base = 2, exponent = 3
Output: 8
Explanation: 2 raised to the power of 3 is 8.
 */
public class Power_Of_Num {
    public static int power(int base,int exp)
    {
        int base2 = 1;
        for (int i = 1; i <= exp; i++) {
            base2 *= base;
        }

        return base2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(power(base,exp));
        sc.close();
    }
    
}
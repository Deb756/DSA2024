// Calculating Armstrong Numbers
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to check if a number is an Armstrong number.
// Example:
// Input: number = 153
// Output: Armstrong Number
// Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.

public class Armstrong_num {
    public static String checkArm(int val)
    {
        int temp = val;
        int count = 0;
        while (val != 0) {
            int rem = (val%10);
            count += sqNum(rem, 3);
            val /= 10;
        }
        System.out.println(count);
        return count == temp ? "Armstrong":"Not Armstrong";
    }
    public static int sqNum(int base,int exp)
    {
        int count = 1;
        for (int i = 0; i < exp; i++) {
            count *= base;
        }
        return count;
    }

    public static void main(String[] args) {
        int val = 153;
        System.out.println(checkArm(val));
    }
}

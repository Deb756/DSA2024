
// Finding the Number of Perfect Numbers Up to a Given Limit
// Difficulty: Medium
// Topics: Number Theory
// Description: Write a program to find how many perfect numbers exist up to a given limit.
// Example:
// Input: limit = 30
// Output: 2
// Explanation: There is only one perfect number (6,28) up to 30.

import java.util.Scanner;

public class perfect_no {
    public static int perfectNO(int num)
    {
        int count = 0 ;

        // perfect no
            for (int j = 1; j <= num/2; j++) {
                if(num%j == 0)
                {
                    count+=j;
                    // System.out.println(count);
                }
        }

        return count == num ? 1 : 0;
    }
    public static int perfect_no_inRange(int range)
    {
        int rCount = 0 ;
        for (int i = 1; i <= range; i++) {
            rCount += perfectNO(i);
        }
        return rCount;
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the Limit : ");
        // System.out.println(perfectNO(sc.nextInt()));
        System.out.println(perfect_no_inRange(sc.nextInt()));
        sc.close();
    }
}

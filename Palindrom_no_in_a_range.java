// Checking for Palindromic Numbers in a Range
// Difficulty: Medium
// Topics: Mathematical Computations
// Description: Write a program to check for palindromic numbers within a given range.
// Example:
// Input: start = 1, end = 100
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99]
// Explanation: Palindromic numbers between 1 and 100 are the numbers listed.

import java.util.Scanner;

public class Palindrom_no_in_a_range {
    public static boolean isPalindrome(int num)
    {
        int orginalNum = num;
        int rev  = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        return orginalNum == rev;
    }
    public static void getPallindrome(int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if(isPalindrome(i))
            {
                System.out.print(i+" ");
                count ++;
            }
        }
        System.out.println();
        System.out.println("No of Pallindrome no Between "+start+" and "+end+" is : "+count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        getPallindrome(start, end);
        sc.close();
    }
}

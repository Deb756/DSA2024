// Given a number num, our task is to find the closest Palindrome number whose absolute difference with the given number is minimal. If 2 Palindrome numbers have the same absolute difference as the given number, take the smaller one.

// Example 1:

// Input: num = 9
// Output: 9
// Explanation: 9 itself is a palindrome
// number.
// Example 2:

// Input: num = 489
// Output: 484
// Explanation: closest palindrome numbers from
// 489 are 484 and 494. Absolute difference between
// 489 and 494 is equal to the absolute difference
// between 484 and 489 but 484 is smaller than 494.

import java.util.Scanner;

public class closest_PallindromeNo {
    public static boolean pallindrome(long num) {
        long orgNum = num;
        long rev = 0;
        while (num != 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return orgNum == rev;
    }

    public static long closestPalindrome(long num) {
        if (num < 10) {
            return num;
        }
        long turn1 = 0;
        long turn2 = 0;
        long pal1 = 0;
        long pal2 = 0;
        for (int i = (int) num; i > 0; i--) {
            if (pallindrome(i)) {
                pal1 = i;
                break;
            }
            turn1++;
        }
        for (int i = (int) num; i < num + 100; i++) {
            if (pallindrome(i)) {
                pal2 = i;
                break;
            }
            turn2++;
        }
        if (turn1 < turn2) {
            return pal1;
        } else if (turn1 == turn2) {
            return pal1 < pal2 ? pal1 : pal2;
        } else {
            return pal2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(closestPalindrome(sc.nextInt()));
        sc.close();
    }
}

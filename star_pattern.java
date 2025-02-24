// Generating a Diamond Pattern of Stars
// Difficulty: Medium
// Topics: Patterns, Basic Programming
// Description: Write a program to create a diamond pattern with stars of a given size.
// Example:
// Input: size = 5
// Output:

//   *  
//  ***  
// *****  
//  ***  
//   *  

import java.util.Scanner;

public class star_pattern {
    public static void diamond(int num) {
        int size = (num / 2) + 1;
        int m, n;
        for (m = 1; m <= size; m++) {
            for (n = 1; n <= size - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (m = size - 1; m > 0; m--) {
            for (n = 1; n <= size - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the Size : ");
        int size = sc.nextInt();
        if (size % 2 == 0) {
            System.out.println("Diamond pattern cant be made for size  : " + size);
        } else {
            diamond(size);
        }
        sc.close();
    }
}

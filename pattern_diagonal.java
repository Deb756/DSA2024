// Generating a Matrix with a Diagonal Pattern
// Difficulty: Medium
// Topics: Matrix Operations
// Description: Write a program to create a matrix where elements form diagonal lines of a given pattern.
// Example:
// Input: size = 4
// Output:

// 1 0 0 0  
// 1 1 0 0  
// 1 1 1 0  
// 1 1 1 1  

import java.util.Scanner;

public class pattern_diagonal {
    public static void getMatrix(int size)
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // j != i ? System.out.println("1"):System.out.println("0");
                System.out.print(j <= i ? "1" : "0");
                // System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Matrix : ");
        getMatrix(sc.nextInt());
        
        sc.close();
    }
}

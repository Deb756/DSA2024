// Generating a Matrix with Multiplication Table
// Difficulty: Easy
// Topics: Arrays, Matrix Operations
// Description: Write a program to generate a matrix where each element at position (i, j) is the product of i and j.
// Example:
// Input: size = 3
// Output:
// 1 2 3  
// 2 4 6  
// 3 6 9 

import java.util.Scanner;

public class matrix_with_mul {
    public static void table(int size)
    {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the Size of the Matrix : ");
        table(sc.nextInt());
        sc.close();
    }
}

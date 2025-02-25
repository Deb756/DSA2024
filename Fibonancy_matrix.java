// Generating a Matrix of Fibonacci Numbers
// Difficulty: Medium
// Topics: Arrays, Matrix Operations
// Description: Write a program to generate a matrix where each element is a Fibonacci number.
// Example:
// Input: size = 3
// Output:

// 1 1 2  
// 3 5 8  
// 13 21 34  

import java.util.Scanner;

public class Fibonancy_matrix {

    public static int fibo(int num) {
        return num <= 1 ? num : fibo(num - 1) + fibo(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int terms = size * size;
        int arr[] = new int[terms];
        int arrC = 0;
        for (int i = 0; i < terms; i++) {
            arr[i] = fibo(i + 1);
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[arrC] + " ");
                arrC++;
            }
            System.out.println();
        }
        sc.close();
    }
}

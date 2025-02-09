// Generating a Square Matrix of a Given Size
// Difficulty: Medium
// Topics: Arrays, Matrix Operations
// Description: Write a program to generate a square matrix of a given size and fill it with sequential numbers.
// Example:
// Input: size = 3
// Output:

// 1 2 3  
// 4 5 6  
// 7 8 9  

public class SquareMatrix {

    public static void generateSquareMatrix(int n) {
        int number = 1; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(number++ + " ");
                // number++; 
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int size = 4; 
        generateSquareMatrix(size); 
    }
}


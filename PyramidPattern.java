
//     *
//    ***
//   *****
//  *******
// *********

public class PyramidPattern {

    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Printing spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Moving to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pyramid
        printPyramid(rows);
    }
}


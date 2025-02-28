// Finding All Divisors of the Product of Two Numbers
// Difficulty: Medium
// Topics: Number Theory
// Description: Write a program to find all divisors of the product of two given numbers.
// Example:
// Input: number1 = 6, number2 = 10
// Output: [1, 2, 3, 5, 6, 10, 15, 30]
// Explanation: The product of 6 and 10 is 60, and its divisors are listed.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class divisor_of_prod_twoNum {
    public static void getDivisor(int n1, int n2) {
        int prod = (n1 * n2);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= prod / 2; i++) {
            if (prod % i == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetre the two Number : ");
        getDivisor(sc.nextInt(), sc.nextInt());
        sc.close();
    }
}

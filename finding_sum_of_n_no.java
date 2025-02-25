// Finding the Sum of the First N Prime Numbers
// Difficulty: Medium
// Topics: Prime Numbers, Mathematical Computations
// Description: Write a program to calculate the sum of the first N prime numbers.
// Example:
// Input: N = 4
// Output: 17
// Explanation: The sum of the first 4 prime numbers (2 + 3 + 5 + 7) is 17.

import java.util.Scanner;

public class finding_sum_of_n_no {
    public static int primeNo(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count == 1 ? n : 0;
    }

    public static int sum_of_prime(int noTerm) {
        int sum = 0;
        int count = noTerm;
        for (int i = 1; i < noTerm * 3; i++) {
            if (primeNo(i) > 0) {
                sum += primeNo(i);
                count--;
            }
            if (count == 0) {
                break;
            }
            // System.out.println(primeNo(i));
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entere the value for N : ");

        System.out.println(sum_of_prime(sc.nextInt()));
        // System.out.println(primeNo(sc.nextInt()));
        sc.close();
    }
}

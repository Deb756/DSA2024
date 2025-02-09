// Finding the Sum of the First N Prime Numbers
// Difficulty: Medium
// Topics: Prime Numbers, Mathematical Computations
// Description: Write a program to calculate the sum of the first N prime numbers.
// Example:
// Input: N = 4
// Output: 17
// Explanation: The sum of the first 4 prime numbers (2 + 3 + 5 + 7) is 17.

import java.util.ArrayList;
import java.util.List;

public class finding_sum_of_n_prime_num {
    public static List<Integer> findPrime(int range)
    {
        List<Integer> l = new ArrayList<>();
        int count2 = 0;
        for (int i = 1; i < 5*range; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count == 2)
            {
                // System.out.println(i);
                l.add(i);
                count2++;
                if(count2 == range)
                 break;
            }
        }

        return l;
    }
    public static void main(String[] args) {
        int range=7;
        System.out.println(findPrime(range));
    }
}

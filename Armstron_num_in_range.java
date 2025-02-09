
// Checking for Armstrong Numbers in a Range
// Difficulty: Easy
// Topics: Basic Programming, Number Theory
// Description: Write a program to find all Armstrong numbers within a given range.
// Example:
// Input: range = [1, 500]
// Output: [1, 153, 370, 371, 407]
// Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.

import java.util.ArrayList;
import java.util.List;

public class Armstron_num_in_range {
    public static boolean checkArm(int val)
    {
        int temp = val;
        int count = 0;
        while (val != 0) {
            int rem = (val%10);
            count += sqNum(rem, 3);
            val /= 10;
        }
        return count == temp ? true:false;
    }
    public static int sqNum(int base,int exp)
    {
        int count = 1;
        for (int i = 0; i < exp; i++) {
            count *= base;
        }
        return count;
    }

    public static List<Integer> findArm(int[] range)
    {
        List<Integer> l1 = new ArrayList<>();
        for (int i = range[0]; i < range[range.length-1]; i++) {
            if(checkArm(i))
            {
                l1.add(i);
            }
        }
        return l1;
    }


    public static void main(String[] args) {
        int[] range = {1, 500};
        System.out.println(findArm(range));
    }
}

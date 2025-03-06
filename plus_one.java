// Given a non-negative number represented as a list of digits, add 1 to the number (increment the number represented by the digits). The digits are stored such that the most significant digit is first element of array.
// Example 1:
// Input: 
// N = 3
// arr[] = {1, 2, 4}
// Output: 
// 1 2 5
// Explanation:
// 124+1 = 125, and so the Output
// Input: 
// N = 3
// arr[] = {9,9,9}
// Output: 
// 1 0 0 0
// Explanation:
// 999+1 = 1000, and so the output

import java.util.ArrayList;
import java.util.List;

public class plus_one {
    // public static int getNum(int res) {
    // while (res != 0) {
    // int digit = res % 10;
    // res /= 10;
    // return digit;
    // }
    // }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> arr, int N) {
        int res = 0;
        for (int i = 0; i < arr.size(); i++) {
            res = res * 10 + (arr.get(i) % 10);
        }
        res += 1;
        // System.out.println(res);
        List<Integer> list = new ArrayList<>();
        while (res != 0) {
            int digit = res % 10;
            list.add(digit);
            res /= 10;
        }
        ArrayList<Integer> aList = new ArrayList<>(list.reversed());
        // System.out.println(list.reversed());
        return aList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        ArrayList<Integer> result = plusOne(arr, arr.size());
        System.out.println(result); // Output: [1, 2, 4]
    }
}

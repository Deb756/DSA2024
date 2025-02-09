// Finding All Pairs of Elements in an Array that Add Up to a Given Sum
// Difficulty: Medium
// Topics: Arrays, Hashing
// Description: Write a program to find all pairs of elements in an array whose sum equals a specified target.
// Example:
// Input: array = [1, 2, 3, 4, 5], target = 5
// Output: [(1, 4), (2, 3)]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashing_Array {
    public static List<int[]> findSum(int[] arr, int target) {
        List<int[]> l1 = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        for (int num : arr) {
            int res = target - num;
            if (s1.contains(res)) {
                l1.add(new int[] { res, num });
            }
            s1.add(num);
        }
        return l1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 5;

        List<int[]> l = findSum(arr, target);
        for (int[] pair : l) {
            System.out.println(Arrays.toString(pair));
        }
    }
}

// Finding the Longest Consecutive Sequence in an Array
// Difficulty: Medium
// Topics: Arrays, Hashing
// Description: Write a program to find the longest sequence of consecutive numbers in an array.
// Example:
// Input: array = [100, 4, 200, 1, 3, 2]
// Output: 4
// Explanation: The longest consecutive sequence is [1, 2, 3, 4].

import java.util.ArrayList;
import java.util.List;

public class longest_consecutive_seq {
    public static int[] sortArr(int arr[]) {
        // int arr2[] = arr ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 5, 6, 7, 9, 200, 1, 3, 2 };
        int arr2[] = sortArr(arr);
        List<Integer> resArr = new ArrayList<>();

        // two pointer approach
        for (int i = 0; i <= arr2.length; i++) {
            if (arr2[i] + 1 == arr[i + 1]) {
                resArr.add(arr2[i]);
            } else {
                resArr.add(arr2[i]);
                break;
            }
        }

        System.out.println(resArr);
    }
}

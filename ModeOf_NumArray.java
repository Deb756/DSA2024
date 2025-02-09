// Finding the Mode of Numbers in an Array
// Difficulty: Medium
// Topics: Arrays, Statistical Analysis
// Description: Write a program to find the mode (most frequent number) in an array.
// Example:
// Input: array = [1, 2, 2, 3, 4, 4, 4]
// Output: 4
// Explanation: The most frequent number in the array is 4.

import java.util.HashMap;
import java.util.Map;

public class ModeOf_NumArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 2, 2, 4, 4, 4 };

        Map<Integer, Integer> l1 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (l1.containsKey(arr[i])) {
                l1.put(arr[i], l1.get(arr[i]) + 1);
            } else {
                l1.put(arr[i], 1);
            }
        }

        System.out.println(l1);

        int mode = 0;
        int maxnum = 0;
        for (Map.Entry<Integer, Integer> entry : l1.entrySet()) {
            if (entry.getValue() > maxnum) {
                maxnum = entry.getValue();
                mode = entry.getKey();
            }
        }
        System.out.println(mode);

    }
}

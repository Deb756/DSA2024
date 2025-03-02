// Given an array arr consisting of positive integer numbers, remove all duplicate numbers.

// Example:

// Input: arr[] = [2, 2, 3, 3, 7, 5] 
// Output: [2, 3, 7, 5]
// Explanation: After removing the duplicates 2 and 3 we get 2 3 7 5.
// Input: arr[] = [2, 2, 5, 5, 7, 7] 
// Output: [2, 5, 7]
// Input: arr[] = [8, 7] 
// Output: [8, 7]


import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_frmArr {
    public static void removeDuplicate(int arr[]) {
        Set<Integer> set = new LinkedHashSet<>();

        for (Integer elem : arr) {
            set.add(elem);
        }

        System.out.println(set);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 7, 5 };
        removeDuplicate(arr);
    }
}

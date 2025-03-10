// Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
// Note: If the number x is not found in the array then return both the indices as -1.

// Examples:

// Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
// Output: [2, 5]
// Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5
// Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
// Output: [6, 6]
// Explanation: First and last occurrence of 7 is at index 6
// Input: arr[] = [1, 2, 3], x = 4
// Output: [-1, -1]
// Explanation: No occurrence of 4 in the array, so, output is [-1, -1]

import java.util.ArrayList;

public class First_and_last_occurance_ofElem {
    public static ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        boolean getElm = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                getElm = true;
                list.add(i);
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                list.add(i);
                break;
            }
        }
        if (!getElm) {
            list.add(-1);
            list.add(-1);
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3 };
        int target = 4;
        System.out.println(find(arr, target));
    }
}

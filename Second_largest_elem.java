// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

// Note: The second largest element should not be equal to the largest element.
// Examples:

// Input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.
// Input: arr[] = [10, 5, 10]
// Output: 5
// Explanation: The largest element of the array is 10 and the second largest element is 5.

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Second_largest_elem {
    // public static int[] sortedArr(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[i] > arr[j]) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }
    // }
    // }
    // return arr;
    // }

    public static int getSecondLargest(int[] arr) {
        // int resArr[] = sortedArr(arr); // this uses bubble sort (O(n^2))
        // List<Integer> list = new ArrayList<>();
        Arrays.sort(arr); // Arrays.sort(obj) uses pivort sort / Quick sort (O(n log n))
        Set<Integer> set = new TreeSet<>();
        for (Integer elem : arr) {
            set.add(elem);
        }
        // System.out.println(set);
        // it convert Set to an array
        int[] fArr = set.stream().mapToInt(Integer::intValue).toArray();

        for (int i : fArr) {
            System.out.println(i);
        }

        return fArr.length > 1 ? fArr[fArr.length - 2] : -1;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 10 };
        System.out.println("Second Largest Elem : " + getSecondLargest(arr));
    }
}

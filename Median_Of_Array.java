/**
 * Finding the Median of an Array
 * Difficulty: Medium
 * Topics: Arrays, Sorting
 * Description: Write a program to find the median of an array of numbers.
 * Example:
 * Input: array = [3, 1, 2, 4, 5]
 * Output: 3
 * Explanation: The median of the sorted array [1, 2, 3, 4, 5] is 3.
 */
public class Median_Of_Array {
    public static int[] arrSort(int[] arr) {
        // int[] arr2 = new int[arr.length];
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

    public static int median(int[] arr) {
        return arr[arr.length / 2];
    }

    public static void main(String[] args) {
        int[] array = { 3, 1, 2, 4, 5 };
        int arr2[] = arrSort(array);
        System.out.println(median(arr2));
    }

}
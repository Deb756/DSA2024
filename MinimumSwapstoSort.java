// Given an array arr[] of distinct elements. Find the minimum number of swaps required to sort the array in strictly increasing order.

// Examples:

// Input: arr[] = [2, 8, 5, 4]
// Output: 1
// Explanation: Swap 8 with 4 to get the sorted array.
// Input: arr[] = [10, 19, 6, 3, 5]
// Output: 2
// Explanation: Swap 10 with 3 and 19 with 5 to get the sorted array.
// Input: arr[] = [1, 3, 4, 5, 6]
// Output: 0
// Explanation: Input array is already sorted.


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumSwapstoSort {
    public static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int minSwaps(int arr[]) {
        // Code here
        Map<Integer,Integer> map = new HashMap<>();
        // adding in a map as its index as val and elem as key
        for (int i=0;i<arr.length;i++) {
            map.put(arr[i],i);
        }
        System.out.println(map);
        Arrays.sort(arr);
        int minSwap = 0;
        // while will be used
        int i=0;
        while(i != arr.length)
        {
            if(i != map.get(arr[i]))
            {
                swap(arr, i, map.get(arr[i]));
                minSwap++;
            }
            else i++;
        }

        return minSwap;
    }
    public static void main(String[] args) {
        int arr[] = {10, 19, 6, 3, 5};
        System.out.println(minSwaps(arr));
    }
}

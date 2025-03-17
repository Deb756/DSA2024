// Given an array arr of N integers, the task is to replace each element of the array by its rank in the array. The rank of an element is defined as the distance between the element with the first element of the array when the array is arranged in ascending order. If two or more are same in the array then their rank is also the same as the rank of the first occurrence of the element. 
// Example 1:
// Input:
// N = 6
// arr = [20, 15, 26, 2, 98, 6]
// Output:
// 4, 3, 5, 1, 6, 2
// Explanation:
// After sorting, array becomes {2,6,15,20,26,98}
// Rank(2) = 1 (at index 0) 
// Rank(6) = 2 (at index 1) 
// Rank(15) = 3 (at index 2) 
// Rank(20) = 4 (at index 3) and so on..
// Example 2:
// Input:
// N = 4
// arr = [2, 2, 1, 6]
// Output:
// 2, 2, 1, 3
// Explanation:
// After sorting, array becomes {1, 2, 2, 6}
// Rank(1) = 1 (at index 0) 
// Rank(2) = 2 (at index 1) 
// Rank(2) = 2 (at index 2) 
// Rank(6) = 3 (at index 3)
// Rank(6) = 3 because rank after 2 is 3 as rank 
// of same element remains same and for next element 
// increases by 1.
// Expected Time Complexity: O(N * logN)
// Expected Auxiliary Space: O(N)

import java.util.Arrays;
import java.util.HashMap;

public class Replaceelementsbyitsrankinthearray {
    public static int[] replaceWithRank(int arr[], int N) {

        // optimized method
        
        int[] sortedArr = arr.clone(); // Create a copy of arr
        Arrays.sort(sortedArr); // Sort the array

        // Map to store ranks
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) { // Assign rank only for first occurrence
                rankMap.put(num, rank++);
            }
        }

        // Replace elements in the original array with their rank
        int[] resArr = new int[N];
        for (int i = 0; i < N; i++) {
            resArr[i] = rankMap.get(arr[i]);
        }
        return resArr;
    }

    public static void main(String[] args) {
        int arr[] = { 20, 15, 26, 2, 98, 6 };
        for (int i : replaceWithRank(arr, arr.length)) {
            System.out.print(i + " ");
        }
    }
}

// Merge k Sorted Arrays
// Difficulty: MediumAccuracy: 67.25%Submissions: 112K+Points: 4Average Time: 45m
// Given k sorted arrays arranged in the form of a matrix of size k * k. The task is to merge them into one sorted array. Return the merged sorted array ( as a pointer to the merged sorted arrays in cpp, as an ArrayList in java, and list in python).


// Examples :

// Input: k = 3, arr[][] = {{1,2,3},{4,5,6},{7,8,9}}
// Output: 1 2 3 4 5 6 7 8 9
// Explanation: Above test case has 3 sorted arrays of size 3, 3, 3 arr[][] = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]. The merged list will be [1, 2, 3, 4, 5, 6, 7, 8, 9].
// Input: k = 4, arr[][]={{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}}
// Output: 1 2 2 2 3 3 4 4 5 5 6 6 7 8 9 9 
// Explanation: Above test case has 4 sorted arrays of size 4, 4, 4, 4 arr[][] = [[1, 2, 2, 2], [3, 3, 4, 4], [5, 5, 6, 6], [7, 8, 9, 9 ]]. The merged list will be [1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8, 9, 9].

import java.util.ArrayList;
import java.util.Collections;

public class MergekSortedArrays {
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> list =  new ArrayList<>();
        // Adding matrix to list in o(n) time complexity
        int row = arr.length;
        int cols = arr[0].length;
        // row * cols insted of arr.len bcz it will ittrates only arr.length not full matrix
        for (int i = 0,r=0,c=0; i < row * cols; i++) {
            list.add(arr[r][c]);
            c++;
            // next row
            if(c == cols)
            {
                c=0;
                r++;
            }
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{2,2,3,4},{5,5,6,6},{7,8,9,9}};
        int k = 4;
        System.out.println(mergeKArrays(arr, k));
    }
}

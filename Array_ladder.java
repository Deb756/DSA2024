// You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

// Examples:

// Input: arr = [16, 17, 4, 3, 5, 2]
// Output: [17, 5, 2]
// Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
// Input: arr = [10, 4, 2, 4, 1]
// Output: [10, 4, 4, 1]
// Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side
// Input: arr = [5, 10, 20, 40]
// Output: [40]
// Explanation: When an array is sorted in increasing order, only the rightmost element is leader.
// Input: arr = [30, 10, 10, 5]
// Output: [30, 10, 10, 5]
// Explanation: When an array is sorted in non-increasing order, all elements are leaders.

import java.util.ArrayList;

public class Array_ladder {
    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> aList = new ArrayList<>();
        int maxElem = arr[arr.length - 1];
        aList.add(maxElem);
        for (int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] >= maxElem)
            {
                maxElem = arr[i];
                aList.add(maxElem);
            }
        }
        return aList;
    }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        System.out.println(leaders(arr));
        
    }
}

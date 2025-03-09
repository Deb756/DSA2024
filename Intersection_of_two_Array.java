// Given two unsorted integer arrays a[] and b[] each consisting of distinct elements, the task is to return the count of elements in the intersection (or common elements) of the two arrays.

// Intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

// Examples:

// Input: a[] = [89, 24, 75, 11, 23], b[] = [89, 2, 4]
// Output: 1
// Explanation: 89 is the only element in the intersection of two arrays.
// Input: a[] = [1, 2, 4, 3, 5, 6], b[] = [3, 4, 5, 6, 7]
// Output: 4
// Explanation: 3, 4, 5, and 6 are the elements in the intersection of two arrays.
// Input: a[] = [20, 10, 30, 50, 40], b[] = [15, 25, 30, 20, 35]
// Output: 2
// Explanation: 20 and 30 are the elements in the intersection of the two arrays.

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_two_Array {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        // Your code here
        // using hash set contains()
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer elem : a) {
            set.add(elem);
        }

        for (int i = 0; i < b.length; i++) {
            if (set.contains(b[i])) {
                count++;
            }
        }

        // System.out.println(set);
        return count;
    }

    public static void main(String[] args) {
        int a[] = { 20, 10, 30, 50, 40 };
        int b[] = { 15, 25, 30, 20, 35 };
        // Arrays.sort(a);
        // Arrays.sort(b);
        System.out.println("Number of Elem Intersection : " + numberofElementsInIntersection(a, b));
    }
}

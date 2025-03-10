
// Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.

// Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.
// Examples:

// Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
// Output: 1 2 3 4 5 6 7
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
// Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
// Output: 1 2 3 4 5
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
// Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
// Output: 1 2
// Explanation: Distinct elements including both the arrays are: 1 2.

// -7 8
// -8 -3 8
// Your Code's output is: 
// -3 -7 -8 8
// It's Correct output is: 
// -8 -7 -3 8

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Union_of_array {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        // (IMP)
        // use tree set for containing the elemnt in a Order and is important
        Set<Integer> set = new TreeSet<>();
        for (Integer elem : a) {
            set.add(elem);
        }
        System.out.println(set);
        for (Integer elem : b) {
            set.add(elem);
        }
        System.out.println(set);
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer elem : set) {
            list.add(elem);
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int a[] = { -7 ,8 };
        int b[] = { -8 ,-3 ,8 };
        System.out.println(findUnion(a, b));
    }
}

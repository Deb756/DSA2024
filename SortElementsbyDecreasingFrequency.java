// Given an array of integers arr[], sort the array according to the frequency of elements, i.e. elements that have higher frequency comes first. If the frequencies of two elements are the same, then the smaller number comes first.

// Examples :

// Input: arr[] = [5, 5, 4, 6, 4]
// Output: [4, 4, 5, 5, 6]
// Explanation: The highest frequency here is 2. Both 5 and 4 have that frequency. Now since the frequencies are the same the smaller element comes first. So 4 4 comes first then comes 5 5. Finally comes 6. The output is 4 4 5 5 6.
// Input: arr[] = [9, 9, 9, 2, 5]
// Output: [9, 9, 9, 2, 5]
// Explanation: The highest frequency here is 3. Element 9 has the highest frequency So 9 9 9 comes first. Now both 2 and 5 have the same frequency. So we print smaller elements first. The output is 9 9 9 2 5.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
// import java.util.PriorityQueue;

public class SortElementsbyDecreasingFrequency {
    public static ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            list.add(i);
        }
        Collections.sort(list, (x, y) -> map.get(x) == map.get(y) ? x - y : map.get(y) - map.get(x));

        System.out.println(map);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 9, 9, 2, 5 };
        System.out.println(sortByFreq(arr));
    }
}

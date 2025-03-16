// Given a non-empty integer array arr[] of size n, find the top k elements which have the highest frequency in the array.

// Note: If two numbers have the same frequencies, then the larger number should be given more preference.

// Examples:

// Input: arr[] = [3, 1, 4, 4, 5, 2, 6, 1], k = 2
// Output: [4, 1]
// Explanation: Frequency of 4 is 2 and frequency of 1 is 2, these two have the maximum frequency and 4 is larger than 1.
// Input: arr[] = [7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9], k = 4
// Output: [5, 11, 7, 10]
// Explanation: Frequency of 5 is 3, frequency of 11 is 2, frequency of 7 is 2, frequency of 10 is 1.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentinArray {
    public static ArrayList<Integer> topKFrequent(int[] arr, int k) {
        // Your code here
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        System.out.println(freqMap);
        // Step 2: Use a max-heap (PriorityQueue) with custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                (a, b) -> freqMap.get(a).equals(freqMap.get(b)) ? b - a : freqMap.get(b) - freqMap.get(a));

        // Step 3: Add all elements to the heap
        maxHeap.addAll(freqMap.keySet());

        // Step 4: Extract top K elements
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            result.add(maxHeap.poll());
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1 };
        int k = 2;
        System.out.println(topKFrequent(arr, k));
    }
}

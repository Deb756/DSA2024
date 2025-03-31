// Given an unsorted array of integers, find the number of subarrays having sum exactly equal to a given number k.

// Examples:

// Input: arr = [10, 2, -2, -20, 10], k = -10
// Output: 3
// Explaination: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.
// Input: arr = [9, 4, 20, 3, 10, 5], k = 33
// Output: 2
// Explaination: Subarrays: arr[0...2], arr[2...4] have sum exactly equal to 33.
// Input: arr = [1, 3, 5], k = 0
// Output: 0
// Explaination: No subarray with 0 sum.
// Time Complexity: O(n)Auxiliary Space: O(n)

import java.util.HashMap;
import java.util.Map;

public class SubarrayswithsumK {
    public static int countSubarrays(int arr[], int k) {
        // your code here
        // taking prefix sum in map
        Map<Integer,Integer> prefixSum = new HashMap<>();
        int res = 0;
        int currSum = 0;
        for(int i=0;i<arr.length;i++)
        {
            currSum += arr[i];
            if(currSum == k)
            {
                res++;
            }
            if(prefixSum.containsKey(currSum-k))
            {
                res += prefixSum.get(currSum-k);
            }
            prefixSum.put(currSum,prefixSum.getOrDefault(currSum, 0)+1);
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {9, 4, 20, 3, 10, 5};
        int k = 13;
        System.out.println(countSubarrays(arr, k));
    }
}

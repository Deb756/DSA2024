// Given an array of strings, return all groups of strings that are anagrams. The strings in each group must be arranged in the order of their appearance in the original array. Refer to the sample case for clarification.

// Examples:

// Input: arr[] = ["act", "god", "cat", "dog", "tac"]
// Output: [["act", "cat", "tac"], ["god", "dog"]]
// Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.
// Input: arr[] = ["no", "on", "is"]
// Output: [["is"], ["no", "on"]]
// Explanation: There are 2 groups of anagrams "is" makes group 1. "no", "on" make group 2.
// Input: arr[] = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]
// Output: [["abc", "cab", "bac"], ["listen", "silent", "enlist"], ["rat", "tar", "art"]]
// Explanation: 
// Group 1: "abc", "bac", and "cab" are anagrams.
// Group 2: "listen", "silent", and "enlist" are anagrams.
// Group 3: "rat", "tar", and "art" are anagrams.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class PrintAnagramTogether {
    @SuppressWarnings("unused")
    public static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> resList = new ArrayList<>();

        // map to store simmilar elem
        Map<String, ArrayList<String>> map = new TreeMap<>();

        for (String str : arr) {
            // soring the String elems
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);

            // Adding them as a Arraylist to the Map
            // here if same element then add it to the existing Alist otherwise create
            // another Alist
            ArrayList<String> list = map.getOrDefault(sortedStr, new ArrayList<>());
            list.add(str);
            map.put(sortedStr, list);
        }
        
        // System.out.println(map);

        // adding val to the ArayList
        // for (Map.Entry<String,ArrayList<String>> entry : map.entrySet()) {
        // resList.add(entry.getValue());
        // }
        // lambda function to ittrate over map
        map.forEach((k, v) -> resList.add(v));
        return resList;
    }

    public static void main(String[] args) {
        String arr[] = { "listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art" };
        System.out.println(anagrams(arr));
    }
}

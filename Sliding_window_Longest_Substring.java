// Finding the Longest Substring Without Repeating Characters**
// Difficulty: Medium
// Topics: String Manipulation, Sliding Window
// Description: Write a program to find the longest substring without repeating characters in a given string.
// Example:
// Input: string = "abcabcbb"
// Output: "abc"
// Explanation: The longest substring without repeating characters is "abc".

import java.util.ArrayList;
// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sliding_window_Longest_Substring {

    public static String findSub(String s) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        List<Character> ch = new ArrayList<>(set);
        StringBuilder res = new StringBuilder();
        for (Character c : ch) {
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(findSub(s));
    }
}

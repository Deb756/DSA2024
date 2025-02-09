// Finding the Longest Substring Without Repeating Characters**
// Difficulty: Medium
// Topics: String Manipulation, Sliding Window
// Description: Write a program to find the longest substring without repeating characters in a given string.
// Example:
// Input: string = "abcabcbb"
// Output: "abc"
// Explanation: The longest substring without repeating characters is "abc".

import java.util.HashSet;
import java.util.Set;

public class Sliding_window_Longest_Substring {

    // public static String findSub(String s)
    // {
    //     String temp = s;
        

    //     return null;
    // }
    public static void main(String[] args) {
        String s = "bbbczabcabcbb";
        
        Set <Character> st = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }

        System.out.println(st);
    }
}

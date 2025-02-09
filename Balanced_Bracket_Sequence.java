// Checking for a Balanced Bracket Sequence
// Difficulty: Medium
// Topics: String Manipulation, Stack
// Description: Write a program to check if a given string with brackets is balanced.
// Example:
// Input: string = "{[()]}"
// Output: True
// Explanation: The brackets are balanced.

import java.util.Stack;

public class Balanced_Bracket_Sequence {

    @SuppressWarnings("unlikely-arg-type")
    public static String findSeq(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            st.add(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(')
            {
                st.add(str.charAt(i));
            }
            else
            {
                st.remove(st.contains('{'));
            }
        }

        return st.toString();
    }

    public static void main(String[] args) {
        String inp = "{[()]}";
        System.out.println(findSeq(inp));
    }
}

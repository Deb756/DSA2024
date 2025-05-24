// Input: S = "(()("
// Output: 2
// Explanation: The longest valid 
// substring is "()". Length = 2.
// Example 2:

// Input: S = "()(())("
// Output: 6
// Explanation: The longest valid 
// substring is "()(())". Length = 6.

package Stack;

import java.util.Stack;

public class LongestValidParenthesisLTCode {
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // base for the first valid substring
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else { // c == ')'
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i); // reset base index
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String st = "()(())";
        // Solution s = new Solution();
        // int res = s.longestValidParentheses(st);
        int res = longestValidParentheses(st);
        System.out.println(res);
    }

}

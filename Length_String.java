// Determining the Length of a String Without Using Built-In Functions
// Difficulty: Medium
// Topics: String Manipulation
// Description: Write a program to determine the length of a string without using built-in functions.
// Example:
// Input: string = "hello"
// Output: 5
// Explanation: The length of the string "hello" is determined without using built-in functions.

public class Length_String {
    public static int findLen(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Length of String is : " + findLen(str));
    }
}

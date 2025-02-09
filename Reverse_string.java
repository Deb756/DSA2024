
// Reversing a String
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to reverse a given string.
// Example:
// Input: string = "programming"
// Output: "gnimmargorp"
// Explanation: The reversed string of "programming" is "gnimmargorp".



public class Reverse_string {
    public static void revStr(String str)
    {
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "programming";
        revStr(str);
    }
}

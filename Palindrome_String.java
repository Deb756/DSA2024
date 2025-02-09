
// Identifying Palindromes
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to check if a string or number is a palindrome.
// Example:
// Input: string = "radar"
// Output: Palindrome
// Explanation: "radar" reads the same backward as forward.


public class Palindrome_String {

    public static String checkPal(String str)
    {
        String temp = str;
        StringBuilder sb = new StringBuilder(str);
         sb.reverse();
        // converting to string

        return temp.equalsIgnoreCase(sb.toString())?"Pallindrome":"Not Pallindrome";
    }
    public static void main(String[] args) {
        String str = "radare";
        System.out.println(checkPal(str));
    }
}

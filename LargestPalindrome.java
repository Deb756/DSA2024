
// Finding the Largest Palindrome in a String
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to find the largest palindrome in a given string.
// Example:
// Input: string = "babad"
// Output: "bab" or "aba"
// Explanation: Both "bab" and "aba" are valid palindromes in the string.


public class LargestPalindrome {
    
    // Helper function to expand around the center and return the longest palindrome
    private static String expandAroundCenter(String s, int left, int right) {
        // Expand as long as the characters are the same and within the string bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the palindrome substring
        return s.substring(left + 1, right);
    }
    
    // Function to find the largest palindrome in a given string
    public static String findLargestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        
        String longestPalindrome = "";
        
        // Loop through each character as a potential center
        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindromes (single character center)
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = oddPalindrome;
            }
            
            // Even-length palindromes (two characters as center)
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = evenPalindrome;
            }
        }
        
        return longestPalindrome;
    }

    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Largest palindrome: " + findLargestPalindrome(input));
    }
}


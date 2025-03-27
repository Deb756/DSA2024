// Two strings are called k-anagrams if both of the below conditions are true.
// 1. Both have same number of characters.
// 2. Two strings can become anagram by changing at most k characters in a string.

// Given two strings of lowercase alphabets and an integer value k, the task is to find if two strings are k-anagrams of each other or not.

// Example:

// Input: s1 = "fodr", s2 = "gork", k = 2
// Output: true
// Explanation: We can change 'f' -> 'g' and 'd' -> 'k' in s1.
// Input: s1 = "geeks", s2 = "eggkf", k = 1
// Output: false
// Explanation: We can update or modify only 1 value but there is a need of modifying 2 characters i.e. 'g' and 'f' in s2.
// Input: s1 = "adb", s2 = "fdab", k = 2
// Output: false
// Explanation: Both the strings have different numbers of characters.
public class StringKAnagrams {
    public static boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        // if len are not same then false
        if (s1.length() != s2.length()) {
            return false;
        }
        int arr[] = new int[26];
        // here it will add 0++ = 1 to the arr above if that char present from thr
        // alphabet
        for (char c : s1.toCharArray()) {
            arr[c - 'a']++;
        }
        // it will add -1 to the arr to the arr and if the elem already present then
        // it will make it 0 like 1-- = 0 if not then 0-- = 1
        for (char c : s2.toCharArray()) {
            arr[c - 'a']--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // it will count exact no of distinct char
        int ans = 0;
        for (int num : arr) {
            if (num > 0) {
                ans += num;
            }
        }
        return ans <= k;
    }

    public static void main(String[] args) {
        String s1 = "fodr";
        String s2 = "gork";
        int k = 2;
        System.out.println(areKAnagrams(s1, s2, k));
    }
}

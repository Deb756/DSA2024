
// Counting Vowels and Consonants in a String
// Difficulty: Easy
// Topics: Basic Programming, String Manipulation
// Description: Write a program to count vowels and consonants in a given string.
// Example:
// Input: string = "hello world"
// Output: Vowels: 3, Consonants: 7
// Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d).

public class Vowel_Consonant_in_String {

    public static void countVowl(String str) {
        String str2 = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == 'a' || str2.charAt(i) == 'e' || str2.charAt(i) == 'i' || str2.charAt(i) == 'o'
                    || str2.charAt(i) == 'u') {
                vowels++;
            } 
            else if (str2.charAt(i) == ' ')
            {
                
            }
            else {
                consonants++;
            }
        }
        System.out.println("Vowels : " + vowels + ", Consonants : " + consonants);
    }

    public static void main(String[] args) {
        String str = "Hallo World";
        countVowl(str);
    }
}


import java.util.Arrays;


/**
 * Checking for an Anagram
 * Difficulty: Easy
 * Topics: String Manipulation
 * Description: Write a program to check if two strings are anagrams.
 * Example:
 * Input: string1 = "listen", string2 = "silent"
 * Output: True
 * Explanation: "listen" and "silent" are anagrams of each other.
 */
public class Anagram_String {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        // converting to char array
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr2);
        String s = new String(arr1);
        String ss = new String(arr2);
        if(s.equalsIgnoreCase(ss))
        {
            System.out.println("Anagram String");
        }else{
            System.out.println("Not Annagram String");
        }

        
        

        
    }
}

// String to Integer (atoi)
// Example 1:
// Input: s = "42"
// Output: 42
// Explanation:
// The underlined characters are what is read in and the caret is the current reader position.
// Step 1: "42" (no characters read because there is no leading whitespace)
//          ^
// Step 2: "42" (no characters read because there is neither a '-' nor '+')
//          ^
// Step 3: "42" ("42" is read in)
//            ^
// Example 2:
// Input: s = " -042"
// Output: -42
// Explanation:
// Step 1: "   -042" (leading whitespace is read and ignored)
//             ^
// Step 2: "   -042" ('-' is read, so the result should be negative)
//              ^
// Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
//                ^
// Example 3:
// Input: s = "1337c0d3"
// Output: 1337
// Explanation:
// Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
//          ^
// Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
//          ^
// Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
//              ^
// Example 4:
// Input: s = "0-1"
// Output: 0
// Explanation:
// Step 1: "0-1" (no characters read because there is no leading whitespace)
//          ^
// Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
//          ^
// Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
//           ^
// Example 5:
// Input: s = "words and 987"
// Output: 0
// Explanation:
// Reading stops at the first non-digit character 'w'.
// the number shouldn't exceed integer range if it exceeding then return Integer maxvalue or Integer minvalue
// -91283472332
// 91283472332

public class String_to_integer {
    public static int myAtoi(String s) {
        int i = 0;
        long num = 0;
        int sign = 1;

        // check whitespace
        while(i < s.length() && s.charAt(i) == ' ')
        {
            i++;
        }
        // check for sign
        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-'))
        {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // checking number
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // check  if num is > < of int range
            if(sign == 1 && num > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -num < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            i++;
        }
       return (int) num * sign;
    }

    public static void main(String[] args) {
        String str = "90 -9";
        System.out.println("Number is : " + myAtoi(str));
    }
}

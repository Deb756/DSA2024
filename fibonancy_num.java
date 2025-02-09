import java.util.ArrayList;
import java.util.List;

// Generating the Fibonacci Series
// Difficulty: Easy
// Topics: Basic Programming, Sequences
// Description: Write a program to generate the Fibonacci series up to a given number.
// Example:
// Input: limit = 10
// Output: [0, 1, 1, 2, 3, 5, 8]
// Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].




public class fibonancy_num {

    public static List<Integer> fiboNum(int limit)
    {
        List<Integer> l1 = new ArrayList<>();
        int num1 = 0;
        int num2 = 1;
        l1.add(num1);
        l1.add(num2);
        while((num1+num2) < limit)
        {
            int res = num1+num2;
            l1.add(res);
            num1 = num2;
            num2 = res;
        }
        
        return l1;
    }

    public static void main(String[] args) {
        int limit = 10;
        System.out.println(fiboNum(limit));
    }
}

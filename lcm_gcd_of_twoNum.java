// Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD. The function inputs two integers a and b and returns a list containing their LCM and GCD.

// Examples:

// Input: a = 5 , b = 10
// Output: [10, 5]
// Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
// Input: a = 14 , b = 8
// Output: [56, 2]
// Explanation: LCM of 14 and 8 is 56, while their GCD is 2.

import java.util.Scanner;

public class lcm_gcd_of_twoNum {
    public static int gcd(int a,int b)
    {
        return b == 0 ? a : gcd(b,a%b);
    }

    public static int lcm(int a,int b)
    {
        return a*b/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Lcm and Gcd is : ["+lcm(num1,num2)+","+gcd(num1,num2)+"]");
        sc.close();
    }
}

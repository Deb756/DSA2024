// midium
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

import java.util.Scanner;

public class Reverse_integer {
    public static int revNum(int num) {
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev > Integer.MAX_VALUE / 10 && rem > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev < Integer.MIN_VALUE / 10 && rem < -8))
                return 0;

            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Output : " + revNum(sc.nextInt()));
        sc.close();
    }
}

import java.util.Scanner;

public class add_1st_and_last_digit_ofANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number here : ");
        Long num = sc.nextLong();
        Long tnum = num;
        int count = 0;
        while (tnum != 0) {
            count ++;
            tnum /= 10;
        }
        if(count == 4)
        {
            Long firstDigit = num / 1000;
            Long lastDigit = num%10;
            System.out.println("Addition of 1st and last digit of "+num+" : "+(firstDigit+lastDigit));
        }
        else
        {
            System.out.println(num + " is not a 4 digit number");
        }
        sc.close();
    }
}

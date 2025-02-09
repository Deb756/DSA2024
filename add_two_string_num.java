// str = "De1ba3f"
//    sum = 1+3=4

import java.util.Scanner;

public class add_two_string_num {
    public static int getSum(String str) {
        // String str = "De1ba3f";
        String[] splitArray = str.split("");
        String arr[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        int count = 0;
        for (String s : splitArray) {
            for (String s2 : arr) {
                if(s.equalsIgnoreCase(s2))
                {
                    int add = Integer.parseInt(s);
                    count+=add;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphanumeric number");
        String sen = sc.nextLine();
        System.out.println("Sum  is " + getSum(sen));
        sc.close();
    }
}

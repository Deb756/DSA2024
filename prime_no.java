import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("prime");
        } else {
            System.out.println("not");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class fibonancy_by_recursion {
    public static int fibo(int num) {
        return num <= 1 ? num : fibo(num - 1) + fibo(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms here : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // if (fibo(i) == 5) {
            //     break;
            // }
            System.out.print(fibo(i) + " ");
        }
        sc.close();
    }
}

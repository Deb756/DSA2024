import java.util.Scanner;

public class Factorial_by_recursion {
    public static long facte = 1;
    public static long fact(int num)
    {
        if(num == 0)
        {
            return facte;
        }
        facte *= num;
        return fact(--num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fact(n));
        sc.close();
    }
}

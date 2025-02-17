import java.util.Scanner;

public class Power_of_a_num_recursion {

    public static int res = 1;
    public static int power(int base , int exp)
    {
        if(exp == 0)
        {
            return res;
        }
         res *= base;
        return power( base, exp-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println(power(base,exp));
        sc.close();
    }
}

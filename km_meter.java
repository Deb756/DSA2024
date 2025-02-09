import java.util.Scanner;

public class km_meter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Eneter Kilometer here : ");
        Long km = sc.nextLong();

        System.out.println(km+" kilometer is "+(km*1000)+" meter");

        sc.close();
    }
}

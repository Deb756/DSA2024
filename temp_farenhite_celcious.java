import java.util.Scanner;

public class temp_farenhite_celcious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temprature here : ");
        int temp = sc.nextInt();

        System.out.println(temp+" farenhite is \n "+((temp-32)*5/9+273.15)+" kelvin\n"+((temp-32)*5/9)+" celcious");

        sc.close();
    }
}

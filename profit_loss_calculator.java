import java.util.Scanner;

public class profit_loss_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost price");
        float cost_p = sc.nextFloat();
        System.out.println("Enter the sell price");
        float sell_p = sc.nextFloat();
        float p_l = (float) Math.round(((sell_p-cost_p)/cost_p)*100);
        float p_l2 = (sell_p-cost_p);
        System.out.println("Profit or loss % age =  "+p_l+"%");
        System.out.println("Profit or loss =  "+p_l2);


        sc.close();
    }
}

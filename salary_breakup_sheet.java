import java.util.Scanner;

public class salary_breakup_sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary here : ");
        float basic_sal = sc.nextFloat();
        System.out.print("Basic salary : "+basic_sal+"\n"
                            +"DA : "+((basic_sal*70/100))+"\n"
                            +"HRA : "+((basic_sal*20/100))+"\n"
                            +"Medical Allowence : "+((basic_sal*10/100))+"\n"
                            +"PF : "+((basic_sal*7/100))+"\n"
                            +"Professional task : "+(200)+"\n"
                            +"--------------------------------"+"\n"
                            +"Gross salary : "+(basic_sal += 
                            ((basic_sal*70/100)+(basic_sal*20/100)+(basic_sal*10/100)-(basic_sal*7/100)-200)));

        
        sc.close();
    }
}

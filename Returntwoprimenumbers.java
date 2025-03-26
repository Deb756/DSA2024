import java.util.ArrayList;
import java.util.List;

public class Returntwoprimenumbers {
    public static boolean prime(int n)
    {
        if(n < 2)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        // wrong do it again
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            boolean a = prime(i);
            boolean b = prime(n-i);
            if(a && b)
            {
                list.add(i);
                list.add(n-i);
                break;
            }
        }
        System.out.println(list);
    }
}

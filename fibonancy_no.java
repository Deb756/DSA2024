public class fibonancy_no {
    public static void main(String[] args) {
        int start = 0;
        int end = 1;
        System.out.print(start+end + " ");
        while ((start + end) < 100) {
            int res = start + end;
            System.out.print(res + " ");
            start = end;
            end = res;
        }
    }
}

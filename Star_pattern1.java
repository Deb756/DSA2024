public class Star_pattern1 {
    public static void main(String[] args) {

        int row = 9;
        int star = 1;
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < row; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < star; k++) {
                    System.out.print("*");
            }
            System.out.println();
            star += 2;
        }
        int row2 = row;
        int star2 = star-2;
        int space = 0;
        for (int i = star; i >= row2; i--) {
            for(int j = 0;j<space;j++)
            {
                System.out.print(" ");
            }
            for (int k = star2; k > 0; k--) {
                    System.out.print("*");
            }
            System.out.println();
            star2 -= 2;
            space +=1;
        }
    }
}

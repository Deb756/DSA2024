public class Star_pattern1 {
    public static void main(String[] args) {

        int row = 4;
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
    }
}

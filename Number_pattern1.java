public class Number_pattern1 {
    public static void main(String[] args) {
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4

        // int n=4;
        // for(int i=0;i<n;i++)
        // {
        //     int k = 1;
        //     for(int j=0;j<i+1;j++)
        //     { 
        //         System.out.print(k++);
        //     }
        //     System.out.println("");
        // }

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // int n=4;
        // for (int i = 0; i < n; i++) {
        //     for(int j = 0;j<i+1;j++)
        //     {
        //         System.out.print(i+1);
        //     }
        //     System.out.println();
        // }

        //      1
        //    1 2 1
        //   1 3 3 1
        //  1 4 6 4 1 
        int row = 5;
        for (int i = 0; i < row; i++) {
            int n = 1;
            for (int j = i + 1; j < row; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                    System.out.print(n +" ");
                    n = n * (i-k)/(k+1);
                    
            }
            System.out.println(" ");
        }

    }
}

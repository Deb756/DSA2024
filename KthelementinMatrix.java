// Given a N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.

// Example 1:
// Input:
// N = 4
// mat[][] =     {{16, 28, 60, 64},
//                    {22, 41, 63, 91},
//                    {27, 50, 87, 93},
//                    {36, 78, 87, 94 }}
// K = 3
// Output: 27
// Explanation: 27 is the 3rd smallest element.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthelementinMatrix {
    public static int kthSmallest(int[][] mat, int n, int k) {
        // code here.
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length - 1; j++) {
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return k < 2 && n < 2 ? list.get(0) : list.get(k - 1);
    }

    public static void main(String[] args) {
        int mat[][] = { { 16, 28, 60, 64 },
                { 22, 41, 63, 91 },
                { 27, 50, 87, 93 },
                { 36, 78, 87, 94 } };
        int n = 4;
        // 7th smallest elem
        int k = 3;
        System.out.println(kthSmallest(mat, n, k));
    }
}

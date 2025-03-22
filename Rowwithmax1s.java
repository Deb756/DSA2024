// You are given a 2D binary array arr[][] consisting of only 1s and 0s. Each row of the array is sorted in non-decreasing order. Your task is to find and return the index of the first row that contains the maximum number of 1s. If no such row exists, return -1.

// Note:

// The array follows 0-based indexing.
// The number of rows and columns in the array are denoted by n and m respectively.
// Examples:

// Input: arr[][] = [[0,1,1,1], [0,0,1,1], [1,1,1,1], [0,0,0,0]]
// Output: 2
// Explanation: Row 2 contains the most number of 1s (4 1s). Hence, the output is 2.
// Input: arr[][] = [[0,0], [1,1]]
// Output: 1
// Explanation: Row 1 contains the most number of 1s (2 1s). Hence, the output is 1.
// Input: arr[][] = [[0,0], [0,0]]
// Output: -1
// Explanation: No row contains any 1s, so the output is -1.

// Time Complexity: O(n + m)Auxiliary Space: O(1)

// import java.util.ArrayList;

public class Rowwithmax1s {
    public static int rowWithMax1s(int arr[][]) {
        // code here
        int maxRow1 = 0;
        int fCount = 0;
        // traversing matrix with o(n)
        int row = arr.length;
        int col = arr[0].length;
        // ArrayList<Integer> list = new ArrayList<>();
        int count1 = 0;
        // TC =O(n*m);
        for (int i = 0, r = 0, c = 0; i < row * col; i++) {
            // list.add(arr[r][c]);
            if (arr[r][c] == 1) {
                count1++;
            }

            if (fCount < count1) {
                fCount = count1;
                maxRow1 = r;
            }
            c++;
            if (c == col) {
                // System.out.println(r + " " + fCount);
                count1 = 0;
                c = 0;
                r++;
            }
        }
        // System.out.println(list);
        return maxRow1;

    }

    public static void main(String[] args) {
        // int arr[][] = { { 0, 1, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 1 }, { 0, 0, 0, 1
        // }, { 0, 1, 1, 1 }, { 0, 0, 0, 1 },
        // { 0, 0, 0, 1 } };
        // int arr[][] = { { 0, 0 }, { 1, 1 } };
        int arr[][] = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
        System.out.println(rowWithMax1s(arr));
    }
}

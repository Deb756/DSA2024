// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

// Example 1:
// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
// Example 2:

// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Intervals {
    public static int[][] getInterval(int[][] in) {
        // sort the array
        int n = in.length;
        Arrays.sort(in, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] + a[1];
            }
        });

        ArrayList<int[]> ans = new ArrayList<>();
        // we have to check the intervals one by one
        for (int i = 0; i < n; i++) {
            // check if ans[] [] is empty or not if empty add the interval
            // or if in[i][1] > ans.get(ans.size()-1)[1] then also add
            if (ans.isEmpty() || in[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(in[i]);
            } else {
                // check the max of the intervals [3,7] [4,10] = [3,10]
                ans.get(ans.size() - 1)[1] = Math.max(in[i][1], ans.get(ans.size() - 1)[1]);
            }
        }
        // converting list to array
        return ans.toArray(new int[ans.size() - 1][]);
    }

    public static void main(String[] args) {
        // int intervals[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int intervals[][] = { { 1, 4 }, { 4, 5 } };
        int res[][] = getInterval(intervals);

        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            System.out.print("[");
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + ",");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }
}

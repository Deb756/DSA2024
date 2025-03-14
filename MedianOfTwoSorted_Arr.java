// Given two sorted arrays a[] and b[], find and return the median of the combined array after merging them into a single sorted array.

// Examples:

// Input: a[] = [-5, 3, 6, 12, 15], b[] = [-12, -10, -6, -3, 4, 10]
// Output: 3
// Explanation: The merged array is [-12, -10, -6, -5, -3, 3, 4, 6, 10, 12, 15]. So the median of the merged array is 3.
// Input: a[] = [2, 3, 5, 8], b[] = [10, 12, 14, 16, 18, 20]
// Output: 11
// Explanation: The merged array is [2, 3, 5, 8, 10, 12, 14, 16, 18, 20]. So the median of the merged array is (10 + 12) / 2 = 11.
// Input: a[] = [], b[] = [2, 4, 5, 6]
// Output: 4.5
// Explanation: The merged array is [2, 4, 5, 6]. So the median of the merged array is (4 + 5) / 2 = 4.5.

import java.util.Arrays;

public class MedianOfTwoSorted_Arr {
    public static double medianOf2(int a[], int b[]) {
        // Your Code Here
        int resArr[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            resArr[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            resArr[a.length + i] = b[i];
        }

        Arrays.sort(resArr);
        for (int i : resArr) {
            System.out.print(i + " ");
        }

        return resArr.length % 2 == 0 ? (float) (resArr[resArr.length / 2 - 1] + resArr[resArr.length / 2 ]) / 2
                : resArr[resArr.length / 2];
    }

    public static void main(String[] args) {
        int a[] = {-5, 3, 6, 12, 15};
        int b[] = { -12, -10, -6, -3, 4, 10 };

        System.out.println(medianOf2(a, b));
    }
}

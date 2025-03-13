// Geek is going for a training program for n days. He can perform any of these activities: Running, Fighting, and Learning Practice. Each activity has some point on each day. As Geek wants to improve all his skills, he can't do the same activity on two consecutive days. Given a 2D array arr[][] of size n where arr[i][0], arr[i][1], and arr[i][2] represent the merit points for Running, Fighting, and Learning on the i-th day, determine the maximum total merit points Geek can achieve .

// Example:

// Input: arr[]= [[1, 2, 5], [3, 1, 1], [3, 3, 3]]
// Output: 11
// Explanation: Geek will learn a new move and earn 5 point then on second day he will do running and earn 3 point and on third day he will do fighting and earn 3 points so, maximum merit point will be 11.
// Input: arr[]= [[1, 1, 1], [2, 2, 2], [3, 3, 3]]
// Output: 6
// Explanation: Geek can perform any activity each day while adhering to the constraints, in order to maximize his total merit points as 6.
// Input: arr[]= [[4, 2, 6]]
// Output: 6
// Explanation: Geek will learn a new move to make his merit points as 6.

public class MultiDM_arr_Geeks_training {
    public static int maximumPoints(int arr[][]) {
        // code here
        int fsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int maxElem = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxElem) {
                    maxElem = arr[i][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("max" + maxElem);
            fsum += maxElem;
            System.out.println();
        }
        // System.out.println(fsum);
        return fsum;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 5 },
                { 3, 1, 1 },
                { 3, 3, 3 } };

        System.out.println(maximumPoints(arr));
    }
}

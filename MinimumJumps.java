// You are given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.
// For example:
// If arr[i] = 3, you can jump to index i + 1, i + 2, or i + 3 from position i.
// If arr[i] = 0, you cannot jump forward from that position.
// Your task is to find the minimum number of jumps needed to move from the first position in the array to the last position.
// Note:  Return -1 if you can't reach the end of the array.
// Examples : 
// Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
// Output: 3 
// Explanation: First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last. 
// Input: arr = [1, 4, 3, 2, 6, 7]
// Output: 2 
// Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
// Input: arr = [0, 10, 20]
// Output: -1
// Explanation: We cannot go anywhere from the 1st element.

public class MinimumJumps {
    public static int minJumps(int[] arr) {
        // code here
        int jump = 0;
        int i=0;
        while (i <= arr.length) {
            // if(arr[i] == 0)
            // {
            //     return -1;
            // }
            if(i > arr.length)
            {
                return jump;
            }
            if(i == arr.length-1)
            {
                return jump;
            }
            i += arr[i];
            jump++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {9 ,10 ,1, 2, 3, 4 ,8, 0, 0 ,0, 0, 0 ,0 ,0 ,1};
        System.out.println("No of Jumps : "+minJumps(arr));
    }
}

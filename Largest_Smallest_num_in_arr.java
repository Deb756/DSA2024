
// Finding the Largest and Smallest Numbers in an Array
// Difficulty: Easy
// Topics: Basic Programming, Arrays
// Description: Write a program to find the largest and smallest numbers in an array.
// Example:
// Input: array = [4, 7, 1, 8, 5,15]
// Output: Largest: 8, Smallest: 1
// Explanation: The largest number in the array is 8 and the smallest is 1.


public class Largest_Smallest_num_in_arr {
    public static void findLargeSmall(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Large : "+arr[arr.length-1]+", Small : "+arr[0]);
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 1,203, 8, 5,15,0};
        findLargeSmall(arr);
    }
}

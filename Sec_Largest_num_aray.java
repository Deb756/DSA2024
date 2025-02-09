// Finding the Second Largest Number in an Array
// Difficulty: Medium
// Topics: Arrays, Sorting
// Description: Write a program to find the second largest number in an array.
// Example:
// Input: array = [10, 20, 4, 45, 99]
// Output: 45
// Explanation: The second largest number in the array is 45.



public class Sec_Largest_num_aray {




    public static int findNum(int[] arr)
    {
        int len = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
            if(arr[i] < arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        return arr[len-1];
    }
    public static void main(String[] args) {
        
        int arr[] = {10, 20, 4, 45, 99};
        System.out.println("Second largest num is : "+ findNum(arr));
    }
}

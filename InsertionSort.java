
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            // if j > 0 and arr[j-1] is > arr[j] then it will swapped untill condn false 
            while (j > 0 && arr[j-1] > arr[j] ) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
        

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 9, 7 };
        insertionSort(arr);
    }
}

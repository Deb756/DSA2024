import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static int binarySearch(int sortedArr[], int serchedElem) {
        int start = 0;
        int end = sortedArr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(sortedArr[mid] > serchedElem)
            {
                end = mid - 1;
            }
            if(sortedArr[mid] < serchedElem)
            {
                start = mid + 1;
            }
            if(sortedArr[mid] == serchedElem)
            {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 30, 10, 10, 5 };
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Serched elem at index : " + binarySearch(arr, sc.nextInt()));
        sc.close();

    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Finding Missing Numbers in a Sequence
 * Difficulty: Easy
 * Topics: Basic Programming, Arrays
 * Description: Write a program to find missing numbers in a sequence from 1 to
 * n.
 * Example:
 * Input: sequence = [1, 2, 4, 5]
 * Output: [3]
 * Explanation: The missing number in the sequence from 1 to 5 is 3.
 */
public class Missing_num_array {
    public static List<Integer> findMissingNumbers(int[] arr)
    {
        List<Integer> missArr = new ArrayList<>();

        int min = arr[0];
        int max = arr[arr.length-1];
        
        int misNums = min;
        for (Integer i : arr) {
            while (misNums < i) {
                missArr.add(misNums);
                misNums++;
            }
            //skip the mising number after get caught
            misNums++;
        }

        while(misNums <= max)
        {
            missArr.add(misNums);
            misNums++;
        }


        return missArr;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5};
        //{1, 2, 4, 6, 7, 10}
        List<Integer> missingNumbers = findMissingNumbers(nums);
        System.out.println(missingNumbers);
    }
}
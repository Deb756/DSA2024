import java.util.ArrayList;
// import java.util.Arrays;

public class PlusOneLeetCode {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // if array contains all 9
        int res[] = new int[digits.length + 1];
        res[0] = 1;

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 9,9,0 }; // 9,9,9
        int[] res = plusOne(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : res) {
            list.add(num);
        }
        System.out.println(list);
    }
}

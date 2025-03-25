

public class TrappingRainWater {
    public static int maxWater(int arr[]) {
        // code here
        // prefixMax
        int left[] = new int[arr.length];
        left[0] = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            left[i] = Math.max(left[i-1], arr[i]);
        }
        // right max
        int right[] = new int[arr.length];
        right[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], arr[i]);
        }
        // for (int i : left) {
        //     System.out.println(i);
        // }
        int totlTrapWater = 0;
        for (int i = 0; i < arr.length; i++) {
            totlTrapWater += Math.min(left[i],right[i]) - arr[i];
        }
        return totlTrapWater;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 3, 1, 0, 4};
        System.out.println("Total Trapped Water : "+maxWater(arr));
    }
}

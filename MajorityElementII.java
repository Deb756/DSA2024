
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static List<Integer> findMajority(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
        int majElem = arr.length/3;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > majElem)
            {
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6 };
        System.out.println(findMajority(arr));
    }
}

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Collections;

import java.util.List;


public class CaseSpecificSortingofStrings {
    public static String sortedStr(String s)
    {   
        
        List<Character> upper = new ArrayList<>();
        List<Character> lower = new ArrayList<>();
        // Map<Integer,String> s = new TreeMap<>();
        // for(Map.Entry<String,Integer> entry : s.entr)
        
        for(char ch : s.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                upper.add(ch);
            }
            else
            {
                lower.add(ch);
            }
        }
        Collections.sort(upper);
        Collections.sort(lower);
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        for(char ch:s.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                sb.append(upper.get(i++));
            }
            else
            {
                sb.append(lower.get(j++));
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "defRTSersUXI";
        System.out.println(sortedStr(s));
    }
}

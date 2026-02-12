package strings.Problems;

import java.util.HashMap;
import java.util.Map;

public class LC242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        for (char i : s.toCharArray()){
            int count = map.getOrDefault(i,0);
            map.put(i,++count);

        }
        for (char i : t.toCharArray()){
            int count = map2.getOrDefault(i,0);
            map2.put(i,++count);

        }
        return map.equals(map2);
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("ratt","ratt"));
    }
}

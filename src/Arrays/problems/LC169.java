package Arrays.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC169 {
    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            int value = map.getOrDefault(i,0);
            int count = ++value;
            map.put(i,count);
            //System.out.println(map);
        }
        int output = -1;
        int count = -1;
        for(int i : map.keySet()){
            if(map.get(i)> count){
                count = map.get(i);
                output = i;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2,2,3,4,4,3,3,1,1,1}));
    }

}

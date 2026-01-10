package Arrays.problems;

import java.util.HashMap;
import java.util.Map;

public class LC1512 {
    public static int numIdenticalPairs(int[] nums) {
//        int match = 0;
//        for(int i = 0; i<nums.length; i++){
//            for(int j=i ; j<nums.length; j++){
//                if(nums[i] == nums[j]){ // nums[i] == nums[j] && i<j
//                    match++;
//                }
//            }
//        }
//        return match - nums.length;
        Map<Integer,Integer>map = new HashMap<>();
        int pairs = 0;
        for(int i : nums){
            int store = map.getOrDefault(i,0);
            pairs += store;
            map.put(i,++store);
        }
        System.out.println(map);
        return pairs;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }

}

package Arrays.problems;

import java.util.HashSet;
import java.util.Set;

public class LC217 {
    public static boolean containsDuplicate(int[] nums) {
//        Map<Integer,Boolean> check = new HashMap<>(nums.length);
//        for(int i : nums){
//            if(!check.containsKey(i)){
//                check.put(i,true);
//            }
//            else{
//                return true;
//            }
//
//        }
//        return false;
        Set<Integer> check = new HashSet<>(nums.length);
        for(int i : nums){
            if(!check.add(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    }
}

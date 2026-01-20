package Arrays.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for(int i = 0; i< nums.length ; i++){
            int complement = target - nums[i];
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(complement,i);
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4},6)));
        //System.out.println(Arrays.toString(twoSum(new int[]{3,3},6)));
    }
}

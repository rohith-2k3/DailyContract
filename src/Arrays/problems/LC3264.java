package Arrays.problems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class LC3264 {
    static void main() {
        int[] a1 = new int[]{7,71,15};
        System.out.println(Arrays.toString(getFinalState(a1,10,3)));
    }
    public static int[] getFinalState(int[] nums, int k, int multiplier) {
//        for(int i = 0 ; i < k ; i++){
//            int index = 0;
//            int smallest  = Integer.MAX_VALUE;
//            for(int j = 0 ; j< nums.length ; j++){
//                if(nums[j] < smallest){
//                    smallest = nums[j];
//                    index = j;
//                }
//            }
//            nums[index]*=multiplier;
//        }
//        return nums;
       PriorityQueue<Integer> q = new PriorityQueue<>((i, j) -> {
           if (nums[i] == nums[j]) return i - j;   // tie-break by index (first occurrence)
           return nums[i] - nums[j];
       });
        for(int i = 0 ; i< nums.length ; i++){
            q.add(i);
        }
        for(int i = 0 ; i < k ; i++){
            int index  = q.poll();
            nums[index]*=multiplier;
            q.add(index);
        }
        return nums;
    }
}

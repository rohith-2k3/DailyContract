package Arrays.problems;

import java.util.HashSet;
import java.util.Set;

// Boyer–Moore Majority Vote Algorithm. can't be applied here as its number frequency is not greater than n/2 times of ele in array
public class LC961 {
    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
    public static int repeatedNTimes(int[] nums) {
//        int count = 0;
//        int ele = 0;
//        for(int i : nums){
//            if(i == ele){
//                count++;
//            }
//            else{
//                if(count == 0){
//                    ele = i;
//                }
//                else{
//                    count--;
//                }
//            }
//        }
//        return ele;
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) return num;
        }
        return -1;
    }
}

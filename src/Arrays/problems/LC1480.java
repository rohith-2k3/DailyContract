package Arrays.problems;

import java.util.Arrays;

public class LC1480 {
    static void main() {

        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));
    }
    public static int[] runningSum(int[] nums) {
        int [] output = new int[nums.length];
        int sum  = 0;
        for(int i = 0 ; i<nums.length; i++){
            sum+=nums[i];
            output[i]= sum;
        }
        return output;
    }
}

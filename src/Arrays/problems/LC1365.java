package Arrays.problems;

import java.util.*;

public class LC1365 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] output = new int[nums.length];
//        int count = 0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=0;j<nums.length;j++){
//                if(nums[i] > nums[j]){
//                    count++;
//                }
//            }
//            output[i] = count;
//            count = 0;
//        }
//        return output;
        System.out.println(Arrays.toString((nums)));
        int []freq = new int[101];
        for(int i : nums){
            freq[i]++;
        }
        for (int i = 1; i <= 100; i++) {
            freq[i] += freq[i - 1];
        }
        for(int i=0; i < nums.length ; i++){
            int value = nums[i];
            nums[i] = value == 0 ? 0:freq[value-1];
        }

        return nums;
    }
}

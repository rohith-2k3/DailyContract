package Arrays.problems;

import java.util.Arrays;

public class LC1470 {
    public static int[] shuffle(int[] nums, int n) {
        int [] output = new int[nums.length];
        int index = 0;
        for(int i = 0; i<n; i++){
            output[index++] = nums[i];
            output[index++] = nums[i+n];
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));
    }
}

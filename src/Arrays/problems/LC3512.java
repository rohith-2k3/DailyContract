package Arrays.problems;

import java.util.Arrays;

public class LC3512 {
     static int minOperations(int [] nums){
         int k=5;
        int sum =Arrays.stream(nums).sum(); // traditional loop is even more fast, no func calls ,easy for JVM to optimize.
         return sum%k;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,9,7};
        System.out.println(minOperations(nums));
    }
}

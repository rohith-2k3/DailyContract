package Arrays.problems;

import java.util.Arrays;

public class LC2574 {
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            answer[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{10,4,8,3})));
    }
}

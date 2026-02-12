package Arrays.problems;

import java.util.Arrays;

public class LC64 {
    static void main() {
        //System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,2,3})));
        //System.out.println(Arrays.toString(findErrorNums(new int[]{2,3,3})));
        //System.out.println(Arrays.toString(findErrorNums(new int[]{8,7,3,5,3,6,1,4})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{3,2,3,4,6,5})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{2,3,2})));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct_index = nums[i] - 1; // as input starting from 1
            if(nums[i] != nums[correct_index]){
                int temp = nums[correct_index];
                nums[correct_index] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j = 0; j<nums.length;j++){
            if(nums[j] != j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}

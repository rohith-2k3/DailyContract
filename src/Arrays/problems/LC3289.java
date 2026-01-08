package Arrays.problems;

import java.util.Arrays;

public class LC3289 {
    public static int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] sneaky = new int[2];
        Arrays.fill(sneaky,-1);
        int check = -1;
        System.out.println(Arrays.toString(nums));
        for(int i =0;i<nums.length;i++){
            if(nums[i]==check){
                if(sneaky[0] == -1){
                    sneaky[0]=check;
                }
                else {
                    sneaky[1] = check;
                    break;
                }
            }
            check=nums[i];
        }
        return sneaky;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{7,1,5,4,3,4,6,0,9,5,8,2})));

    }
}

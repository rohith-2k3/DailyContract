package Arrays.problems;

import java.util.Arrays;

public class LC3467 {
    public static int[] transformArray(int[] nums) {
        int[] output = new int[nums.length];
        //int count =0;
        int last = nums.length-1;
//        for(int i:nums){
//            if(i%2==0)output[count++]=0;
//        }
//        for(int i:nums){
//            if(i%2!=0)output[count++]=1;
//        }

        for(int i :nums){
            if(i%2!=0)output[last--]=1;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(transformArray(new int[]{4,3,2,1})));
    }
}

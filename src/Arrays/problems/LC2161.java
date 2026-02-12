package Arrays.problems;

import java.util.Arrays;

public class LC2161 {
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] output = new int[nums.length];
        int index = 0;
        for(int i: nums){
            if(i<pivot){
                output[index++]=i;
            }
        }
        for(int i: nums){
            if(i==pivot){
                output[index++]=i;
            }
        }
        for(int i: nums){
            if(i>pivot){
                output[index++]=i;
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int[] array = new int[]{9,12,5,10,14,3,10};
        int pivot = 10;
        System.out.println(Arrays.toString(pivotArray(array,pivot)));
    }
}

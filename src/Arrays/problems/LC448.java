package Arrays.problems;

import strings.Play;

import java.util.ArrayList;
import java.util.List;

public class LC448 {
    static void main() {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct_index = nums[i]-1;
            if(nums[i] != nums[correct_index]){
                int temp = nums[correct_index];
                nums[correct_index] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        List<Integer> output = new ArrayList<>();
        for(int j = 0 ; j <nums.length;j++){
            if(nums[j] != j+1) output.add(j+1);
        }

        return output;

        ///  Second Solution by marking the presence a
//        int n = nums.length;
//        int[] freq = new int[n + 1];
//        List<Integer> result = new ArrayList<>();
//
//        // Mark presence
//        for(int i = 0; i < n; i++) {
//            freq[nums[i]]++;
//        }
//
//        // Find missing numbers
//        for(int i = 1; i <= n; i++) {
//            if(freq[i] == 0) {
//                result.add(i);
//            }
//        }
//
//        return result;
    }
}

package Arrays.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC3289 {
    public static int[] getSneakyNumbers(int[] nums) {
//        int[] freq = new int[nums.length];
//        int[] sneaky = new int[2];
//        int id = 0;
//        for(int i: nums){
//            freq[i]++;
//            if(freq[i]==2){
//                sneaky[id++]=i;
//                if(id == 2) break;
//            }
//        }
//        return sneaky;

        Set<Integer> seen = new HashSet<>();
        int[] result = new int[2];
        int idx = 0;

        for (int num : nums) {
            if (!seen.add(num)) {
                result[idx++] = num;
                if (idx == 2) break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSneakyNumbers(new int[]{7,1,5,4,3,4,6,0,9,5,8,2})));

    }
}

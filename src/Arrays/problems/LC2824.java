package Arrays.problems;

import java.util.List;

public class LC2824 {
    public static void main(String[] args) {
        List<Integer> input = List.of(1,2,3,4);
        System.out.println(countPairs(input,6));
    }
    public static int countPairs(List<Integer> nums, int target) {
        int pairs = 0;
        int i = 0;
        int j = 1;
        while(i < nums.size() -1){
            if(j == nums.size()){
                i++;
                j=i+1;
                continue;
            }
            if(nums.get(i) + nums.get(j) < target){
                pairs++;
            }
            j++;

        }
        return pairs;
    }
}

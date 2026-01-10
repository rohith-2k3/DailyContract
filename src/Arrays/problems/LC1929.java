package Arrays.problems;

import java.util.Arrays;

public class LC1929 {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[]concat = new int[n*2];
        for(int i =0;i<=n-1;i++){
            concat[i]=nums[i];
            concat[i+n]=nums[i];
        }
        return concat;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{12,123,1234})));
    }
}

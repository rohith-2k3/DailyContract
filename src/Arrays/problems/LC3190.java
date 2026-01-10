package Arrays.problems;

public class LC3190 {
    public static int minimumOperations(int[] nums) {
        int ops = 0;
        for(int i=0; i<= nums.length-1;i++){
            if(nums[i]%3==0){
                continue;
            }
            ops++;
//            if(nums[i]+1 %3==0 || nums[i]-1 %3==0){
//                continue;
//            } Unwanted but for clarity

        }
        return ops;
    }
    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1, 2, 3, 4}));
        System.out.println(minimumOperations(new int[]{3,6,9}));
    }
}

package Arrays.problems;

public class LC3701 {
    public static int alternatingSum(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int i : nums){
            if(count%2==0){
                sum+=i;
            }
            else{
                sum-=i;
            }
            count++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(alternatingSum(new int[]{1,3,5,7}));
        System.out.println(alternatingSum(new int[]{100}));
    }
}

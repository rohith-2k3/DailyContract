package Arrays.problems;

public class LC3637 {
    public static boolean isTrionic(int[] nums) {
        int p = -1;
        int q = -1;
        boolean decreasing = false;
        boolean increasing_again = false;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > nums[i-1] && !decreasing){
                // first increasing phase
                p = i;
            } else if (nums[i] < nums[i -1] && p != -1 && !increasing_again) {
                // decreasing phase started
                decreasing = true;
                q = i;
            }else if(nums[i] > nums[i-1] && decreasing){
                // second increasing
                increasing_again = true;
            }
            else {
                return false;
            }
        }
        return p != -1 && q != -1 && increasing_again;
    }
    public static void main() {
        System.out.println(isTrionic(new int[]{1,3,5,4,2,6}));
        System.out.println(isTrionic(new int[]{9,2,9,1}));
    }
}

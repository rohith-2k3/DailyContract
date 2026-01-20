package Arrays.problems;

public class LC268 {
    public static int missingNumber(int[] nums) {
//        Set<Integer> check = new HashSet<>(nums.length);
//        for(int i : nums){
//            check.add(i);
//        }
//        for(int i = 0 ; i<nums.length;i++){
//            if(!check.contains(i)){
//                return i;
//            }
//        }
//        return nums.length;
        int sum = 0;
        for(int i :nums) {
            sum+=i;
        }
        int total = (nums.length * (nums.length + 1) / 2);
        return total - sum;
    }
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,2,4}));
    }
}

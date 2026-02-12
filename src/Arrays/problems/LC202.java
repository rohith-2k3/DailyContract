package Arrays.problems;

import java.util.HashSet;
import java.util.Set;

public class LC202 {
    static void main() {
        //System.out.println(isHappy(19));
        System.out.println(isHappy(1111111));
    }

    public static boolean isHappy(int n) {
//        int sum = 0;
//        if(n == 1){
//            return true;
//        }
//        else if(n < 10 && n != 7){
//            return false;
//        }
//        while(n > 1 || sum >= 7){
//            n = Math.max(n,sum);
//            sum=0;
//            int len = String.valueOf(n).length();
//            for(int i = 0 ; i < len ; i++){
//                sum += (int) Math.pow(n%10,2);
//                n/=10;
//            };
//
//        }
//        if(sum == 1){
//            return true;
//        }
//        else{
//            return false;
//        }
        Set<Integer> cyclic_check = new HashSet<>();
        while(n != 1 && !cyclic_check.contains(n)){
            cyclic_check.add(n);
            n = getSum(n);
        }
        return n == 1;
    }
    private static int getSum(int n){
        int sum = 0;
        while(n>0){
            int last_d = n%10;
            sum+= last_d * last_d;
            n/=10;
        }
        return sum;
    }
}

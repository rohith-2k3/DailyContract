package Arrays.problems;

import java.util.Arrays;

public class LC66 {
     static int[] plusOne(int[] digits) {
        for(int i= digits.length-1 ; i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                break;
            }
            digits[i]=0;
        }
        if(digits[0] == 0){
            int []result = new int[digits.length +1];
            result[0]=1;

            for(int i=0;i<digits.length;i++){
                result[i+1]=digits[i];
            }
            digits = result;
        }
        return digits;

    }

    public static void main(String[] args) {
        int[] check = new int[]{9,9,9};
        System.out.println(Arrays.toString(plusOne(check)));
    }

}

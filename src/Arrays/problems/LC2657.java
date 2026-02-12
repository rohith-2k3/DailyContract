package Arrays.problems;

import java.util.Arrays;

public class LC2657 {
    static void main() {
        int[] a = new int[]{2,3,1};
        int[] b = new int[]{3,1,2};
        System.out.println(Arrays.toString(findThePrefixCommonArray(a,b)));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int [] output = new int[n];
        int [] freq = new int[n+1];
        int count = 0;
        for(int i = 0;i < n ;i++){
            if (++freq[A[i]] == 2) count++;
            if (++freq[B[i]] == 2) count++;

            output[i] = count;

        }
        return output;
    }
}

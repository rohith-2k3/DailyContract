package Arrays.problems;

import java.util.Arrays;

public class LC1816 {
    static void main() {
        System.out.println(truncateSentence("Hello how are you Contestant",4));
    }
    public static String truncateSentence(String s, int k) {
        String[] splittedArray = s.split(" ");
        String output = "";
        for(int i = 0 ; i < k;i++){
            output += splittedArray[i];
            if(k-i > 1){
                output+=" ";
            }
        }
        return output;

    }

}

package Arrays.problems;

import java.util.Arrays;

public class LC1662 {
    public static void main(String[] args) {
        String[] arrword1 = new String[]{"a", "cb"};
        String[] arrword2 = new String[]{"a", "bc"};
        System.out.println(arrayStringsAreEqual(arrword1,arrword2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String t1 = "";
        String t2 = "";
        for(String i : word1){
            t1+=i;
        }for(String i : word2){
            t2+=i;
        }
        if(t1.equals(t2)){
            return true;
        }
        return false;
    }
}

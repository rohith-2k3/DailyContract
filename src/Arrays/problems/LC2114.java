package Arrays.problems;

import java.util.Arrays;

public class LC2114 {
    static void main() {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }
    public static int mostWordsFound(String[] sentences) {
        int output = 0;
        for(String i : sentences){
            int count = i.split(" ").length;
            System.out.println(Arrays.toString( i.split(" ",2)));
            System.out.println(Arrays.toString( i.split(" ")));
            if (count > output) output = count;
        }
        return output;
    }
}

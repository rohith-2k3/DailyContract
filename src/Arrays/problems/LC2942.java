package Arrays.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class LC2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>output = new ArrayList<>();
        for(int s=0;s<words.length;s++){
            if(words[s].indexOf(x)!=-1){
                output.add(s);
            }
        }
        return output;
    }
    public static void main(String[] args) {
        String[]words = new String[]{"abc","abcd","aaaa","acbc"};
        LC2942 obj = new LC2942();
        List<Integer> o = obj.findWordsContaining(words,'a');
        System.out.println(o);
    }
}


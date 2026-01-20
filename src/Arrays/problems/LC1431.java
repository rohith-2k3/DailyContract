package Arrays.problems;

import java.util.ArrayList;
import java.util.List;

public class LC1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int greatest = -1;
        for(int i : candies){
            if(i>greatest)greatest = i;
        }
        for(int j : candies){
            if(j + extraCandies >= greatest) output.add(true);
            else output.add(false);
        }
     return output;
    }
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3},3));
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2},1));
    }
}

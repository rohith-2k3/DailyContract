package Arrays.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC2037 {
    public static void main(String[] args) {
        System.out.println(minMovesToSeat(new int[]{3,1,5},new int[]{2,7,4}));
        System.out.println(minMovesToSeat(new int[]{12,14,19,19,12},new int[]{19,2,17,20,7})); //19
    }
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int output = 0;
        for(int i = 0; i<seats.length;i++){
            output+= Math.abs(seats[i]-students[i]);
        }
        return output;
    }
}

package Arrays.problems;

import java.util.Arrays;

public class LC1637 {
     static void main() {
         int [][] matrix = {
                 {3,1},
                 {9,0},
                 {1,0},
                 {1,4},
                 {5,3},
                 {8,8}
         };
         System.out.println(maxWidthOfVerticalArea(matrix));
    }
    public static int maxWidthOfVerticalArea(int[][] points) {
         int [] x_axis = new int[points.length];
         int largest = -1;
         int index = 0;
            for(int [] arr  : points){
                x_axis[index++] = arr[0];
            }
        Arrays.sort(x_axis);
        for(int i = 1;i< x_axis.length ; i++){
            int diff = x_axis[i] - x_axis[i-1];
            if(diff > largest){
                largest = diff;
            }
        }
         return largest;
    }
}

package Arrays.problems;

import java.util.ArrayList;
import java.util.List;

public class LC3285 {
    static void main() {
        System.out.println(stableMountains(new int[]{1,2,3,4,5},2));
        System.out.println(stableMountains(new int[]{10,0,10,10,10},10));
    }
    public static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < height.length - 1  ; i++){
            if(height[i] > threshold){
                output.add(i+1);
            }
        }
        return output;
    }
}

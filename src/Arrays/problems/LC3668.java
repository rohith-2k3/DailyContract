package Arrays.problems;

import java.util.*;

public class LC3668 {
    public static int[] restoreOrder(int[] order, int[] friends) {
        int[] result = new int[friends.length];
        int index = 0;
//        for(int i =0; i<=order.length-1;i++){
//            for(int j =0; j<=friends.length-1;j++){
//                if(order[i] == friends[j]){
//                    result[index] = friends[j];
//                    index++;
//                }
//            }
//        }
        Set<Integer> present = new HashSet<>();
        for(int i : friends){
            present.add(i);
        }
        for(int i : order){
            if(present.contains(i)){
                result[index++]=i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] order = new int[]{3,1,2,5,4};
        int[] friends = new int[]{1,3,4};
        System.out.println(Arrays.toString(restoreOrder(order,friends)));
    }
}

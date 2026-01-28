package Arrays.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class LC1329 {
    public static int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,PriorityQueue<Integer>> res = new HashMap<>();
        for(int i = 0; i < mat.length ; i++){
            for( int j = 0 ; j < mat[i].length ; j++ ){
                int key = i-j;
                res.putIfAbsent(key, new PriorityQueue<>());
                res.get(key).add(mat[i][j]);
            }
        }
        for(int i = 0; i < mat.length ; i++){
            for( int j = 0 ; j < mat[i].length ; j++ ){
                int key = i-j;
                mat[i][j] = res.get(key).poll();
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int [][]mat = {
                {3, 3 , 1 , 1},
                {2, 2,  1,  2},
                {1, 1,  1,  2}
        };
        // [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
        int[][] res = (diagonalSort(mat));
        for(int [] i : res){
            System.out.println(Arrays.toString(i));
        }
    }
}

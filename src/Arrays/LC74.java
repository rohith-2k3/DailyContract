package Arrays;

public class LC74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int [] array : matrix){
            int right = array.length-1;
            int left = 0;
            while(left <= right){
                int middle = left + (right - left) /2 ;
                if(array[middle]  == target){
                    return true;
                }
                else if(target < array[middle]){
                    right = middle-1;
                }
                else{
                    left = middle + 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.println(searchMatrix(matrix,14));
    }
}

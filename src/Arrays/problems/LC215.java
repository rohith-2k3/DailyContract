package Arrays.problems;

import java.util.Arrays;
import java.util.PriorityQueue;

/* Heap Structure -> Parent <= children
* poll() removes the smallest element •	peek() returns the smallest element
*       1
      /   \
     3     2
    / \   /
   5  6  4
*
*/
public class LC215 {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i : nums){
            heap.add(i);
            System.out.println(heap);
            if(heap.size() > k){
                heap.poll();
            }
        }
         System.out.println(heap); // [1, 3, 2, 5, 6, 4]
//        System.out.println(heap.poll()); // removes the smallest ele
        return heap.peek();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5,6,4};
        int k = 2;
        System.out.println("Output : "+findKthLargest(nums,k));
    }
}

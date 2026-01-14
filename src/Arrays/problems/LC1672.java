package Arrays.problems;



public class LC1672 {
    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int output = 0;
        for(int[] i : accounts){
            for(int j : i){
                sum+=j;
            }
            if(sum > output)output=sum;
            sum = 0;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,2,3},{3,2,1,4}}));
    }
}

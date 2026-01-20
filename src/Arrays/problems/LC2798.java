package Arrays.problems;

import java.sql.Time;

public class LC2798 {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int employees = 0;
        for(int i : hours){
            if(i>=target){
                employees++;
            }
        }
        return employees;
    }
    public static void main(String[] args) {
        System.out.println(numberOfEmployeesWhoMetTarget(new int[]{1,2,3,4},2));
    }
}

package Arrays.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC1282 {
    public static void main(String[] args) {
        System.out.println(groupThePeople(new int[]{2,1,3,3,3,2}));

    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        List<List<Integer>>output = new ArrayList<>();
        int index=0;
        for(int i : groupSizes){
            map.putIfAbsent(i,new ArrayList<>());
            map.get(i).add(index++);
        }
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            int group_size = entry.getKey();
            List<Integer> integers = map.get(group_size);
            for(int i = 0; i<integers.size();i+=group_size){
                List<Integer> grp = new ArrayList<>();
                for (int j = i; j < i + group_size; j++) {
                    grp.add(integers.get(j));
                }
                output.add(grp);
            }
        }
        return output;
    }
}

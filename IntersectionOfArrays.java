import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfArrays {
    public static List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i=0; i<nums[0].length; i++){
            temp.put(nums[0][i],1);
        }
        for(int i=1; i<nums.length; i++){
            HashMap<Integer,Integer> newMap = new HashMap<>();
            for(int j=0; j<nums[i].length; j++){
                if(temp.containsKey(nums[i][j])){
                    newMap.put(nums[i][j],1);
                }
            }
            temp = newMap;
        }
        List<Integer> out = new ArrayList<>();
        for(int a: temp.keySet()){
            out.add(a);
        }
        Collections.sort(out);
        return out;
    }

    public static void main(String[] args) {
        int[][] nums = {{3, 1, 2, 4, 5},{1,2,3,4},{3,4,5,6}};
        System.out.println(intersection(nums));
    }
}

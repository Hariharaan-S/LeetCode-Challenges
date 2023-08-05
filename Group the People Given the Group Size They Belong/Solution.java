import java.util.*;
public class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int size = arr[i];
            List<Integer> t = map.getOrDefault(size,new ArrayList<>());
            t.add(i);
            map.put(size,t);

            if(t.size() == size){
                res.add(t);
                map.remove(size);
            }
        }
        return res;
    }
}
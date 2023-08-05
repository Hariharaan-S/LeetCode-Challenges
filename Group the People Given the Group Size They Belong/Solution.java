import java.util.*;
public class Solution {
    public List<List<Integer>> groupThePeople(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int size = arr[i];
            List<Integer> temp = map.getOrDefault(size,new ArrayList<>());
            temp.add(i);
            map.put(size,temp);

            if(temp.size() == size){
                res.add(temp);
                map.remove(size);
            }
        }
        return res;
    }
}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {

    private static int ifAny(HashMap<Integer,Integer>map){
        for(int i:map.keySet()){
            if(map.get(i)>=1) return 1;
        }
        return 0;
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int t = map.getOrDefault(nums[i],0);
            map.put(nums[i],t+1);
        }
        List<Integer>temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        while(ifAny(map) == 1){
        for(int i:map.keySet()){
            if(map.get(i)>=1){
                temp.add(i);
                map.put(i,map.get(i)-1);
            }
        }
        res.add(new ArrayList<>(temp));
        temp.clear();
        }
        return res;
    }
}
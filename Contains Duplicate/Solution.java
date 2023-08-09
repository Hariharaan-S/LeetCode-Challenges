import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i: nums){
            int t = map.getOrDefault(i,0);
            map.put(i,t+1);
        }
        for(int i: nums){
            if(map.get(i)>1){
                return true;
            }
        }
        return false;
        
    }
}
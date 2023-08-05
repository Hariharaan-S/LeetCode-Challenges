import java.util.*;

class Solution {
    public int[] decompRessRLElist(int[] nums) {
        List<Integer>Res1 = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j=0;j<freq;j++){
                Res1.add(val);
            }
        }
        int Res[] = new int[Res1.size()];
        for(int i=0;i<Res1.size();i++){
            Res[i] = Res1.get(i);
        }
        return Res;
    }
}

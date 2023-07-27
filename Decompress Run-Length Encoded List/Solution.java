import java.util.*;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer>res1 = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j=0;j<freq;j++){
                res1.add(val);
            }
        }
        int res[] = new int[res1.size()];
        for(int i=0;i<res1.size();i++){
            res[i] = res1.get(i);
        }
        return res1;
    }
}

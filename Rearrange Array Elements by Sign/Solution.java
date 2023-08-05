import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        List<Integer>pos = new ArrayList<>();
        List<Integer>neg = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }

        int index = 0;
        for(int i=0;i<pos.size();i++){
            if(index<nums.length){
                ans[index] = pos.get(i);
                index+=2;
            }        
        }
        index = 1;
        for(int i=0;i<neg.size();i++){
            if(index<nums.length){
                ans[index] = neg.get(i);
                index += 2;
            }
        }
        return ans;
    }
}
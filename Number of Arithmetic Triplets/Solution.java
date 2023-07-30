import java.util.HashSet;

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i]-diff)&&s.contains(nums[i]+diff)){
                count++;
            }
        }
        return count;
        
    }
}
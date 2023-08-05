import java.util.Arrays;

class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        for(int i=0;i<k-1;i++){
            nums[nums.length-1] = nums[nums.length-1]+1;
            max += nums[nums.length-1];
        }
        return max;
    }
}
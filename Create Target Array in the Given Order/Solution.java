
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int Target[] = new int [nums.length];
        for(int i=0;i<Target.length;i++){
            int pos = index[i];
            for(int j=Target.length-2;j>=pos;j--){
                Target[j+1] = Target[j];
            }
            Target[pos] = nums[i];
        }
        return Target;
    }
}
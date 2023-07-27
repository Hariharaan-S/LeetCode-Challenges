class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int [nums.length];
        for(int i=0;i<target.length;i++){
            int pos = index[i];
            for(int j=target.length-2;j>=pos;j--){
                target[j+1] = target[j];
            }
            target[pos] = nums[i];
        }
        return target;
    }
}
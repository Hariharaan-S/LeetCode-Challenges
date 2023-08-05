class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int r[] = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                r[left++] = nums[i];
            }
            if(nums[nums.length-1-i]>pivot){
                r[right--] = nums[nums.length-1-i];
            }
        }
        while(left<=right){
            r[left++] = pivot;
        }
        return r;
    }
}
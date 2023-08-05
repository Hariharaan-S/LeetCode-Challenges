class Solution {
    private static int digitSum(int Num){
        int sum = 0;
        while(Num>0){
            sum += Num%10;
            Num/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] Nums) {
        int sum = 0;
        int d = 0;
        for(int i=0;i<Nums.length;i++){
            sum += Nums[i];
            d += digitSum(Nums[i]);
        }
        return Math.abs(sum-d);
    }
}
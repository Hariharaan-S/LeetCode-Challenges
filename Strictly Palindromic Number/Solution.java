class Solution {
    private static String baseConversion(int n,int b){
        String rem = "";
        String res = "";
        while(n>0){
            int temp =  n%b;
            rem += (char)temp;
            n/=b;
        }
        for(int i=0;i<rem.length();i++){
            res += rem.charAt(rem.length()-i-1);
        }
        return res;
    }
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String temp = baseConversion(n,i);
            int l = 0;
            int m = temp.length()-1;
            while(l<=m){
                if(temp.charAt(l) != temp.charAt(m)){
                    return false;
                }
                else{
                    l++;
                    m--;
                }
            }
        }
        return true;
    }
}
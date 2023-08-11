class Solution {
    public String makeSmallestPalindrome(String s) {
        int l = 0;
        int m = s.length()-1;
        char[]arr = s.toCharArray();
        while(l<m){
            if(arr[l] != arr[m]){
                if(arr[l] > arr[m]){
                    arr[l] = arr[m];
                }
                else{
                    arr[m] = arr[l];
                }
            }
            l++;
            m--;
        }
        return new String(arr);
    }
}
import java.util.Arrays;

class Solution {
    public int largestAltitude(int[] gain) {
     int []ans = new int[gain.length+1];
     ans[0] = 0;
     ans[1] = gain[0];
     for(int i=2;i<ans.length;i++){
        ans[i] = ans[i-1] + gain[i-1];
     }   
     Arrays.sort(ans);
     return ans[ans.length-1];

    }
}
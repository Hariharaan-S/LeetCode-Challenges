class Solution {
    public int[] findArray(int[] pref) {
        int []ans = new int[pref.length];
        ans[0] = pref[0];
        if(pref.length == 1){
            return ans;
        }
        for(int i=1;i<pref.length;i++){
            int t1 = pref[i-1];
            int t2 = pref[i];
            ans[i] = t1^t2;
        }
        return ans;
    }
}
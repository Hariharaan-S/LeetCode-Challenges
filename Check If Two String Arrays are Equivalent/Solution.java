class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String res = "";
        String res2 = "";
        for(int i=0;i<word1.length;i++){
            res += word1[i];
        }
        for(int i=0;i<word2.length;i++){
            res2 += word2[i];
        }
        if(res.equals(res2)){
            return true;
        }
        else{
            return false;
        }
    }
}
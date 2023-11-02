class Solution {
    private static boolean isPalindrome(String s){
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        if(s1.toString().equals(s2.toString())){
            return true;
        }
        else{
            return false;
        }
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
}
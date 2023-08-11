class Solution {
    public String reverseWords(String s) {
        String res = "";
        StringBuilder t = new StringBuilder();
        String []arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            t.append(arr[i]);
            t.reverse();
            res += t.toString();
            res += " ";
            t.delete(0,arr[i].length());
        }
        return res.trim();
    }
}
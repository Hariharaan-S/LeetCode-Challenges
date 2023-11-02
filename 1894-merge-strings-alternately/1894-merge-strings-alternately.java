class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] a=word1.toCharArray();
        char[] b=word2.toCharArray();
        int i = 0;
        int j = 0;
        StringBuilder m = new StringBuilder();
        while(i<a.length && j<b.length){
            m.append(a[i++]);
            m.append(b[j++]);
        }
        while(i<a.length){
            m.append(a[i++]);
        }
        while(j<b.length){
            m.append(b[j++]);
        }
        return new String(m);
    }
}
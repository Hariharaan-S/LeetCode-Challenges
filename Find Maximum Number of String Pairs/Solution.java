import java.util.HashMap;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        HashMap<String,Integer>map = new HashMap<>();
        for(String str: words){
            String t = new StringBuilder(str).reverse().toString();
            int c = map.getOrDefault(str,0);
            map.put(t,c+1);
        }
        for(int c: map.values()){
            if(c == 2){
                count++;
            }
        }
        return count;
    }
}
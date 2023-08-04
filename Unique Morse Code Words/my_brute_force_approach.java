import java.util.HashMap;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length == 1){
            return 1;
        }
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Integer,String>map = new HashMap<>();
        HashMap<String,Integer>res = new HashMap<>();
        int key = 97;
        for(int i=0;i<morse.length;i++){
            map.put(key,morse[i]);
            key += 1;
        }
        for(int i=0;i<words.length;i++){
            char str[] = words[i].toCharArray();
            String s = "";
            for(int j=0;j<str.length;j++){
                s += map.get((int)str[j]);
            }
            res.put(s,1);
        }
        return res.size();
    }
}
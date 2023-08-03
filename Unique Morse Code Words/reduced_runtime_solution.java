import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length == 1){
            return 1;
        }
        String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String>res = new HashSet<>();
        for(String word: words){
            StringBuilder s = new StringBuilder();
            for(char c: word.toCharArray()){
                s.append(morse[c-'a']);
            }
            res.add(s.toString());
        }
        return res.size();
    }
}
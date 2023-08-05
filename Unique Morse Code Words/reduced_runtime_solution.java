import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorRepresentations(String[] words) {
        if(words.length == 1){
            return 1;
        }
        String Mor[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String>res = new HashSet<>();
        for(String word: words){
            StringBuilder s = new StringBuilder();
            for(char c: word.toCharArray()){
                s.append(Mor[c-'a']);
            }
            res.add(s.toString());
        }
        return res.size();
    }
}
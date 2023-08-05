import java.util.Arrays;

class Solution {
    public String truncateSentence(String s, int k) {
        String kLength[] = Arrays.copyOfRange(s.split(" "),0,k);
        return String.join(" ",kLength);
    }
}
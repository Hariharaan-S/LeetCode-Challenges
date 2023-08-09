import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(char a: jewels.toCharArray()){
            map.put(a,0);
        }
        for(char a: stones.toCharArray()){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
        }
        int ans=0;
        for(char a: jewels.toCharArray()){
            ans += map.get(a);
        }
        return ans;
    }
}
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.size() == j - i + 1){
                max = Math.max(max, j - i + 1);
                j++;
            }
            else if(map.size() < j - i + 1){
                while(map.size() < j - i + 1){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}

// Sliding Window Template
// while(j < size()){

//     // Calculation's happen's here
// -----------------------------------------------
//     if(condition < k){
//         j++;
//     }
// -----------------------------------------------

// -----------------------------------------------
//     else if(condition == k){
//         // ans <-- calculation
//         j++;
//     }
// ----------------------------------------------

// ----------------------------------------------
//     else if(condition > k){
//         while(condition > k){
//             // remove calculation for i
//             i++;
//         }
//         j++;
//     }
// ----------------------------------------------
// }
// return ans;
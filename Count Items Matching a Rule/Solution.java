import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index;
        if(ruleKey.equals("type")){
            index = 0;
        }
        else if(ruleKey.equals("color")){
            index = 1;
        }
        else{
            index = 2;
        }
        for(int i=0;i<items.size();i++){
            String temp = items.get(i).get(index);
            if(temp.equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
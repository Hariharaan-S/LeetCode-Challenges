class Solution {
    public String interpret(String command) {
        String res  = "";
        for(int i=0;i<command.length()-1;i++){
            if(command.charAt(i) == '('){
                if(command.charAt(i+1) == ')'){
                    res += 'o';
                }
                if(command.charAt(i+1) == 'a'){
                    res += 'a';
                    res += 'l';
                }
            }
            else if(command.charAt(i) == 'G'){
                res += 'G';
            }
        }
        if(command.charAt(command.length()-1) == 'G'){
            res += 'G';
        }
        return res;
    }
}
class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if((double)dist.length-1>=hour){
            return -1;
        }
        int left = 1;
        int right = (int)10e7;
        while(left<=right){
            int m = (left+right)/2;
            if(condition(m,dist,hour)){
                right = m-1;
            }
            else{
                left = m+1;
            }
        }
        return left;
    }
    public static boolean condition(int m,int[]dist,double hour){
        double time = 0;
        for(int i=0;i<dist.length-1;i++){
            time += dist[i]/m;
            time += (dist[i]%m == 0)?0:1; 
        }
        time += (dist[dist.length-1]*1.0)/m;
        if(time<=hour){
            return true;
        }
        else{
            return false;
        }
    }
}
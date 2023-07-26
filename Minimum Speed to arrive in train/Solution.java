class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if((double)dist.length-1>=hour){
            return -1;
        }
        int left = 1;
        int right = (int)10e7;
        while(left<=right){
            int mid = (left+right)/2;
            if(condition(mid,dist,hour)){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    public static boolean condition(int mid,int[]dist,double hour){
        double time = 0;
        for(int i=0;i<dist.length-1;i++){
            time += dist[i]/mid;
            time += (dist[i]%mid == 0)?0:1; 
        }
        time += (dist[dist.length-1]*1.0)/mid;
        if(time<=hour){
            return true;
        }
        else{
            return false;
        }
    }
}
import java.util.Arrays;

class Solution {
    public int maxwidOfVerticalArea(int[][] points) {
        int wid = 0;
        int arr[] = new int[points.length];
        for(int i=0;i<points.length;i++){
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            wid = Math.max(wid,arr[i]-arr[i-1]);
        }
        return wid;
    }
}
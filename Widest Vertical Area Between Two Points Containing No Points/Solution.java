import java.util.Arrays;

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int width = 0;
        int arr[] = new int[points.length];
        for(int i=0;i<points.length;i++){
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            width = Math.max(width,arr[i]-arr[i-1]);
        }
        return width;
    }
}
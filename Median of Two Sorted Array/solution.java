class Solution {
    public static double getMedian(int[] arr){
        if(arr.length%2 == 0){
            int a = arr[arr.length/2];
            int b = arr[(arr.length/2)-1];
            double median = (a+b)/2.0;
            return median;
        }
        else{
            return (double)arr[arr.length/2];
        }
    }
    public static void merge(int arr[], int left[], int right[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }
            else{
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static int[] mergeSort(int[] arr, int l,int r){
        if (l < r) {
            int mid = (l + r) / 2;
            int[] left = new int[mid - l + 1];
            int[] right = new int[r - mid];
            for (int i = 0; i < left.length; i++) {
                left[i] = arr[l + i];
            }
            for (int i = 0; i < right.length; i++) {
                right[i] = arr[mid + 1 + i];
            }
            mergeSort(left, 0, left.length - 1);
            mergeSort(right, 0, right.length - 1);
            merge(arr, left, right);
        }
        return arr;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            arr[index++] = nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[index++] = nums2[i];
        }
        mergeSort(arr,0,nums1.length+nums2.length-1);
        double answer = getMedian(arr);
        return answer;
    }
}
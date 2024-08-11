package Arrays;

public class findPeakInMountainArray {
    public static void main(String[] args) {
        int []arr={1,6,8,9,16,15,4,3,1};
        int ans = peakIndex(arr);
        System.out.println(ans);
    }
    public static int  peakIndex(int []arr){
        int start = 0;
         int end = arr.length-1;
         while (start<end){
             int mid = start+(end-start)/2;
             if (arr[mid]>arr[mid+1]){
                 end = mid;
             }else {
                 start= mid;
             }
         }
         return start;
    }
}

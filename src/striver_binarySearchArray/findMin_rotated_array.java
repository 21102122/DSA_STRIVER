package striver_binarySearchArray;

public class findMin_rotated_array {
    public static void main(String[] args) {

    }
    public static int findMin(int[] arr){
         int start =0;
         int end = arr.length-1;
         while (start<end){
             int mid = start+(end-start)/2;
             if (arr[mid]>arr[end]){
                 start = mid+1;
             }else{
                 end = mid;
             }
         }
         return arr[start];
    }
}

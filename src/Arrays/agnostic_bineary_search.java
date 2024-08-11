package Arrays;

public class agnostic_bineary_search {
    public static void main(String[] args) {
        int arr[] = {-18,-12,-4,0,2,3,4,15,18,22,45,86};
        int target =22;
        int ans = agnostic_binearySearch(arr,target);
        System.out.println(ans);
    }
    public static int agnostic_binearySearch(int arr[], int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];
        int  mid = start+(end-start)/2;

        if (arr[mid]==target){
            return mid;
        }
        if (isAsc){
            if (target<arr[mid]){
                end = mid-1;
            }else {
                start = mid +1;
            }
        }else {
            if (target>arr[mid]){
                end = mid-1;
            }else {
                start= mid+1;
            }
        }
        return -1;
    }
}

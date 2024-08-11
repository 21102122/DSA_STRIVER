package Arrays;

public class bineraySearch {
    public static void main(String[] args) {

        int arr[] = {-18,-12,-4,0,2,3,4,15,18,22,45,86};
        int target =18;
        int ans = binearySearch(arr,target);
        System.out.println(ans);
    }
    public static  int binearySearch(int arr[], int target){
        int start = 0;
        int end = arr.length -1;
        while (start<= end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start= mid +1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}

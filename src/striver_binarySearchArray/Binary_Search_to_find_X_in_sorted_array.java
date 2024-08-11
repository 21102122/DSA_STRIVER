package striver_binarySearchArray;

//problem statement
//Let’s say the given array is = {3, 4, 6, 7, 9, 12, 16, 17} and target = 6.
public class Binary_Search_to_find_X_in_sorted_array {
    public static void main(String[] args) {
        int []arr={3,4,6,7,9,12,16,17};
        int target = 7;
        int ans = binearySearch(arr, target);
        System.out.println(ans);

    }
    public static int binearySearch(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start= mid+1;

            }else {
                return mid;
            }
        }return -1;
    }
}

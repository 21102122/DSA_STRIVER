package Arrays;

public class find_floar_of_number {
    public static int floar_of_number(int arr[], int target){
        int start = 0 ;
         int end = arr.length-1;
         while (start<=end){
             int mid = start+(end-start);
             if (target<arr[mid]){
                 end = mid -1;
             } else if (target>arr[mid]) {
                 start= mid+1;

             }else {
                 return mid;
             }
         }
         return end;

    }
    public static void main(String[] args) {
        int arr[]={1,2,5,6,8,42};
        int target = 7;
        int ans = floar_of_number(arr, target);
        System.out.println(ans);

    }
}

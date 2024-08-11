package Array_medium;

public class divede_subarray_with_equalSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        findSubarrays(arr);
    }
    public static boolean findSubarrays(int[] arr) {
        int totalSum =0;
        for (int i = 0; i <arr.length ; i++) {
            totalSum+=arr[i];

        }
        int prefix =0;
        for (int i = 1; i < arr.length-1; i++) {
            prefix+=arr[i];
            int ans = totalSum-prefix;
            if (prefix==ans){
                return true;
            }

        }
        return false;
    }
}

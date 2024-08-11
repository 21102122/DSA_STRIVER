package ArrayHard;

public class longest_subarray_equal0 {
    public static void main(String[] args) {
        int arr[]={9, -3, 3, -1, 6, -5};
                int k =0;
        int n = arr.length;
        System.out.println(longestSubarray_equals_sum_0(arr,n,k));

    }
    public static int longestSubarray_equals_sum_0(int []arr, int n ,int k){
        int maxLength =0;
        for (int start = 0; start < n; start++) {
            int sum=0;
            for (int end = start; end <n ; end++) {
                sum+= arr[end];
                if(sum==k){
                    maxLength= Math.max(maxLength,end-start+1);
                }

            }

        }
        return maxLength;
    }
}

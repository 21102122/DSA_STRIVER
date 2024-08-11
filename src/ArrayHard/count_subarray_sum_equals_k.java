package ArrayHard;


//https://leetcode.com/problems/subarray-sum-equals-k
public class count_subarray_sum_equals_k {
    public static void main(String[] args) {
        int k = 6;
        int arr[]={3,1,2,4};

        System.out.println(count_sub(arr, k));
        }
    public static int count_sub(int arr[],int k){

        int count =0;
        for (int start = 0; start < arr.length ; start++) {
            int sum =0;

            for (int end = start; end < arr.length ; end++) {
                sum+= arr[end];
                if (sum==k){
                    count++;
                }

            }

        }
        return count;
    }
}

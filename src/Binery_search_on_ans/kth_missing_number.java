package Binery_search_on_ans;

public class kth_missing_number {
    public static void main(String[] args) {

        int[] arr = {4, 7, 9, 10};
        int n = arr.length, k = 4;
//        int ans = brutForce(arr, k);
        int ans1 = missingK(arr,n, k);
        System.out.println("The missing number is: " + ans1);
    }
    public static int missingK(int[] vec, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
    }
    public static int brutForce(int arr[], int k){
        int n =(arr.length);
        for (int i = 0; i < n; i++) {
            if(arr[i]<=k){
                k++;
            }else {
                break;
            }

        }
        return k;
    }
}

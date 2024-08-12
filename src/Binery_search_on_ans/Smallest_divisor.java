package Binery_search_on_ans;

public class Smallest_divisor {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = bruteForce(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }

    public static int bruteForce(int arr[], int limit){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            maxi= Math.max(arr[i],maxi);

        }
        for (int d = 1; d <=maxi ; d++) {
            int sum =0;
            for (int i = 0; i < n; i++) {
                sum += Math.ceil((double)(arr[i]) / (double)(d));

            }
            if(sum<=limit){
                return d;
            }

        }

        return -1;
    }
}

package ArrayHard;

public class maximum_product_subarray {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,0};
        System.out.println(bruteForce(arr));
        System.out.println(optimalApproach(arr));

    }
    public static  int bruteForce(int arr[]){
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int prod =1;
                for (int k = i; k <j ; k++) {
                    prod*=arr[k];
                    result = Math.max(prod,result);
                }

            }

        }
        return result;
    }



    public static int optimalApproach(int arr[]){
        int n = arr.length;
        int pre =1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if (pre==0){
                pre=1;
            }
            if (suff==0){
                suff=1;
            }

            pre*=arr[i];
            suff*=arr[n-i-1];
            ans=(Math.max(ans,Math.max(pre,suff)));
        }
return ans;
    }
}

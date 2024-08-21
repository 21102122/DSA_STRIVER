package bs_2dMatrix;

public class serarch_in_2d {
    public static void main(String[] args) {

        int arr[][]={{1,2,3},
                {4,5,6,} };
        int target =4;
//        System.out.println(bruteforce(arr, target));
//        System.out.println(betterApproach(arr, target));
        System.out.println(optimalApproach(arr, target));
    }


//    brute force approach not all case satisfied
    public static boolean bruteforce(int arr [][], int target){
        int n = arr.length;
        int m= arr[0].length;


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (arr[i][j]==target);
                return true;
            }
        }
        return false;
    }



//    better approach

    public static boolean optimalApproach(int arr[][], int target){
        int n = arr.length;
        int m = arr[0].length;
        int start =0;
        int end = n*m-1;
        while (start<=end){
            int mid = start+(end-start)/2;
                    int row = mid / m, col = mid % m;
        if (arr[row][col] == target){
            return true;
        } else if (arr[row][col]<=target) {
            start= mid+1;

        }else{
            end = mid -1;
        }
        }
        return false;

    }

    //    optimal approach for better solution
    public  static boolean betterApproach (int arr[][], int target){

        int n = arr.length;
        if(n==0){
            return false;
        }
        int m = arr[0].length;
//    // We will treat each row as a sorted array and perform binary search in each row.
        for (int i = 0; i < n; i++) {
            int start =0;
            int end = m-1;


            while (start<=end ){
                int mid  = start+(end-start);
                if(arr[i][mid]==target){
                    return true;
                } else if (target<=arr[i][mid]) {
                    end = mid-1;

                }else {
                    start = mid +1;
                }
            }
        }
        return false;

    }



}
